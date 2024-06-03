package com.tobeto.hotelReservationSystem.controllers;

import com.tobeto.hotelReservationSystem.services.abstracts.UserService;
import com.tobeto.hotelReservationSystem.services.dtos.requests.AddUserRequest;
import com.tobeto.hotelReservationSystem.services.dtos.responses.AddUserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UsersController {
    private  UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public AddUserResponse add(@RequestBody AddUserRequest request){

        return userService.add(request);
    }

}
