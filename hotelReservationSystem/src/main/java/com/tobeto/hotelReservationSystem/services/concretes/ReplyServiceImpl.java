package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.core.utils.exceptions.types.BusinessException;
import com.tobeto.hotelReservationSystem.entities.Feedback;
import com.tobeto.hotelReservationSystem.entities.Reply;
import com.tobeto.hotelReservationSystem.repositories.ReplyRepository;
import com.tobeto.hotelReservationSystem.services.abstracts.FeedbackService;
import com.tobeto.hotelReservationSystem.services.abstracts.ReplyService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reply.AddReplyRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reply.UpdateReplyRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.*;
import com.tobeto.hotelReservationSystem.services.mappers.ReplyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {

    private final ReplyRepository replyRepository;

    private final FeedbackService feedbackService;
    @Override
    public AddReplyResponse add(AddReplyRequest request) {
        Reply newReply = ReplyMapper.INSTANCE.replyToAddReplyRequest(request);
        newReply.setTransactionDone(true);
        newReply.setDate(LocalDateTime.now());
        return ReplyMapper.INSTANCE.addReplyResponseToReply(replyRepository.save(newReply));
    }

    @Override
    public UpdateReplyResponse update(UpdateReplyRequest request) {
        // Var olan feedback'i feedbackService üzerinden bul
        Feedback feedback = feedbackService.getFeedbackById(request.getFeedbackId());
        Optional<Reply> optionalReply = replyRepository.findByFeedbackId(request.getFeedbackId());

        // Reply var mı kontrol et
        if (optionalReply.isEmpty()) {
            throw new RuntimeException("Reply not found for feedback id: " + request.getFeedbackId());
        }

        Reply reply = optionalReply.get();

        // Reply güncelle
        reply.setTitle(request.getTitle());
        reply.setContent(request.getContent());
        reply.setTransactionDone(true); // Doğru yazım: setTransactionalDone
        reply.setDate(LocalDateTime.now());

        // Reply'i kaydet
        replyRepository.save(reply);

        // Feedback güncelle (eğer gerekiyorsa)
        // feedback.set... (gereken güncellemeleri yapın)

        // Entity'leri kaydetmeye gerek yok, çünkü reply zaten managed bir entity

        // Response dön
        return ReplyMapper.INSTANCE.updateReplyResponseToReply(reply);
    }

    @Override
    public GetByIdReplyResponse getById(int id) {

        Reply reply = replyRepository.findById(id).orElseThrow(()->
                new BusinessException("Repl is not found"));
        return ReplyMapper.INSTANCE.getByIdReplyResponseToReply(reply);
    }

    @Override
    public List<GetAllReplyResponse> getAll() {
        List<Reply> replies = replyRepository.findAll();
        List<GetAllReplyResponse> result = new ArrayList<>();

        for (Reply reply:replies){
            GetAllReplyResponse dto= ReplyMapper.INSTANCE.getAllReplyResponsesToReply(reply);
            result.add(dto);
        }

        return result;
    }

    @Override
    public void delete(int id) {
        if(!replyRepository.existsById(id)){
            throw new BusinessException("Feedback not found");
        }
        replyRepository.deleteById(id);
    }
    public GetByFeedbackIdForReply getReplyByFeedbackId(int feedbackId) {
        Optional<Reply> reply = replyRepository.findByFeedbackId(feedbackId);
        if (!reply.isPresent()){
            throw new RuntimeException("reply not found");
        }
        GetByFeedbackIdForReply result = new GetByFeedbackIdForReply();
        result.setTitle(reply.get().getTitle());
        result.setContent(reply.get().getContent());
        result.setTransactionalDone(reply.get().isTransactionDone());
        return result;
    }
}
