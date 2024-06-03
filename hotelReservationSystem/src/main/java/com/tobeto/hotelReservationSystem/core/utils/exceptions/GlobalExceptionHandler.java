//package com.tobeto.hotelReservationSystem.core.utils.exceptions;
//
//import com.tobeto.hotelReservationSystem.core.utils.exceptions.details.BusinessProblemDetails;
//import com.tobeto.hotelReservationSystem.core.utils.exceptions.details.ValidationProblemDetails;
//import com.tobeto.hotelReservationSystem.core.utils.exceptions.types.BusinessException;
//import org.springframework.http.HttpStatus;
//import org.springframework.validation.FieldError;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import java.lang.reflect.Field;
//import java.util.ArrayList;
//import java.util.List;
//
//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler(BusinessException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public BusinessProblemDetails businessExceptionHandler(BusinessException exception){
//
//        return new BusinessProblemDetails(exception.getMessage());
//    }
//
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public ValidationProblemDetails validationExceptionHandler(MethodArgumentNotValidException exception){
//        List<String> errorMessages = new ArrayList<>();
//
//        List<FieldError> errors = exception.getBindingResult().getFieldErrors();
//
//        for (FieldError error:errors){
//            errorMessages.add(error.getDefaultMessage());
//        }
//        return new ValidationProblemDetails(errorMessages);
//    }
//}
