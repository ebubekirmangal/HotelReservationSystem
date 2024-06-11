package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.core.utils.exceptions.types.BusinessException;
import com.tobeto.hotelReservationSystem.entities.Feedback;
import com.tobeto.hotelReservationSystem.repositories.FeedbackRepository;
import com.tobeto.hotelReservationSystem.services.abstracts.FeedbackService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feedback.AddFeedbackRequest;
import com.tobeto.hotelReservationSystem.services.dtos.requests.feedback.UpdateFeedbackRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.AddFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.GetAllFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.GetByIdFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.dtos.responses.feedback.UpdateFeedbackResponse;
import com.tobeto.hotelReservationSystem.services.mappers.FeedbackMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FeedbackServiceImpl implements FeedbackService {

    private FeedbackRepository feedbackRepository;
    @Override
    public AddFeedbackResponse add(AddFeedbackRequest request) {
        if (request == null){
            throw new BusinessException("Feedback cannot be null");
        }
        Feedback feedback = FeedbackMapper.INSTANCE.feedbackToAddFeedbackRequest(request);
        feedback.setDate(LocalDateTime.now());
        Feedback saved = feedbackRepository.save(feedback);

        return FeedbackMapper.INSTANCE.addFeedbackResponseToFeedback(saved);
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
        List<Feedback> feedbacks = feedbackRepository.findAll();
        List<GetAllFeedbackResponse> result = new ArrayList<>();

        for (Feedback feedback:feedbacks){
            GetAllFeedbackResponse dto = FeedbackMapper.INSTANCE.getAllFeedbackResponsesToFeedback(feedback);
            result.add(dto);
        }
        return result;
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
}
