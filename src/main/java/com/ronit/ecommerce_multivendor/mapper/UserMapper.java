package com.ronit.ecommerce_multivendor.mapper;

import com.ronit.ecommerce_multivendor.dto.response.UserResponse;
import com.ronit.ecommerce_multivendor.model.User;


public class UserMapper {
    public static UserResponse toResponse(User user){
        return UserResponse.builder()
                .id(user.getId())
                .email(user.getEmail())
                .password(user.getPassword())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .mobileNumber(user.getMobileNumber())
                .build();
    }
}
