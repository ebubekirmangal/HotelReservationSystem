package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.core.utils.exceptions.types.BusinessException;
import com.tobeto.hotelReservationSystem.entities.Feedback;
import com.tobeto.hotelReservationSystem.entities.Reply;
import com.tobeto.hotelReservationSystem.repositories.FeedbackRepository;
import com.tobeto.hotelReservationSystem.services.abstracts.FeedbackService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feedback.AddFeedbackRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feedback.UpdateFeedbackRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.AddFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.GetAllFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.GetByIdFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.UpdateFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.mappers.FeedbackMapper;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FeedbackServiceImpl implements FeedbackService {

    private FeedbackRepository feedbackRepository;
    @Override
    public AddFeedbackResponse add(AddFeedbackRequest request) {
        Feedback newFeedback = FeedbackMapper.INSTANCE.feedbackToAddFeedbackRequest(request);
        newFeedback.setDate(LocalDateTime.now());

        Reply reply = new Reply();
        reply.setTransactionDone(false);
        reply.setFeedback(newFeedback);
        newFeedback.setReply(reply);
        return FeedbackMapper.INSTANCE.addFeedbackResponseToFeedback(feedbackRepository.save(newFeedback));
    }

    @Override
    public UpdateFeedbackResponse update(UpdateFeedbackRequest request) {
        if(request == null){
            throw new RuntimeException("Feedback cannot be null");
        }
        Feedback updated = feedbackRepository.save(FeedbackMapper.INSTANCE.feedbackToUpdateFeedbackRequest(request));
        return FeedbackMapper.INSTANCE.updateFeedbackResponseToFeedback(updated);
    }

    @Override
    public List<GetAllFeedbackResponse> getAll() {
        List<Feedback> filteredFeedback = feedbackRepository.findAllByOrderByDateDesc();
        return filteredFeedback.stream()
                .map(FeedbackMapper.INSTANCE::getAllFeedbackResponsesToFeedback)
                .collect(Collectors.toList());
    }

    @Override
    public GetByIdFeedbackResponse getById(int id) {
        Feedback feedback = feedbackRepository.findById(id).orElseThrow(
                ()-> new BusinessException("id is not found")
        );
        return FeedbackMapper.INSTANCE.getByIdFeedbackResponseFeedback(feedback);
    }

    @Override
    public void delete(int id) {
        if(!feedbackRepository.existsById(id)){
           throw new BusinessException("Feedback not found");
        }
        feedbackRepository.deleteById(id);
    }
    public Feedback getFeedbackById(int id) {
        return feedbackRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Feedback not found with id: " + id));
    }
}
