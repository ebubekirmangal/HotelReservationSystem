package com.tobeto.hotelReservationSystem.services.concretes;

import com.tobeto.hotelReservationSystem.entities.User;
import com.tobeto.hotelReservationSystem.repositories.UserRepository;
import com.tobeto.hotelReservationSystem.services.abstracts.UserService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.user.AddUserRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.user.AddUserResponse;
import com.tobeto.hotelReservationSystem.services.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor //TODO:bunu girmeyi unutmuşuz
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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
