package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.entities.User;
import com.tobeto.hotelReservationSystem.repositories.UserRepository;
import com.tobeto.hotelReservationSystem.services.abstracts.UserService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.AddUserRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.AddUserResponse;
import com.tobeto.hotelReservationSystem.services.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public AddUserResponse add(AddUserRequest request) {
        User user = UserMapper.INSTANCE.userToAddUserRequest(request);

        User saved = userRepository.save(user);

        return UserMapper.INSTANCE.addUserResponseToUser(saved);
    }
}
