package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.core.utils.exceptions.types.BusinessException;
import com.tobeto.hotelReservationSystem.entities.Reply;
import com.tobeto.hotelReservationSystem.repositories.ReplyRepository;
import com.tobeto.hotelReservationSystem.services.abstracts.ReplyService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reply.AddReplyRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.reply.UpdateReplyRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.AddReplyResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.GetAllReplyResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.GetByIdReplyResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.reply.UpdateReplyResponse;
import com.tobeto.hotelReservationSystem.services.mappers.ReplyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {

    private final ReplyRepository replyRepository;
    @Override
    public AddReplyResponse add(AddReplyRequest request) {
        if(request == null){
            throw new BusinessException("Reply cannot be null");
        }
        Reply reply = ReplyMapper.INSTANCE.replyToAddReplyRequest(request);
        reply.setDate(LocalDateTime.now());
        Reply saved = replyRepository.save(reply);

        return ReplyMapper.INSTANCE.addReplyResponseToReply(saved);
    }

    @Override
    public UpdateReplyResponse update(UpdateReplyRequest request) {
        if (!replyRepository.existsById(request.getId())){
            throw new BusinessException("Reply is not found");
        }
        Reply reply = ReplyMapper.INSTANCE.replyToUpdateReplyRequest(request);
        Reply updated = replyRepository.save(reply);

        return ReplyMapper.INSTANCE.updateReplyResponseToReply(updated);
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
}
