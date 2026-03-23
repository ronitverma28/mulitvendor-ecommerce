package com.ronit.ecommerce_multivendor.service;

import com.ronit.ecommerce_multivendor.dto.request.UserRequest;
import com.ronit.ecommerce_multivendor.dto.response.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse create(UserRequest userRequest);
    UserResponse update(String email, UserRequest userRequest);
    void delete(String id);
    UserResponse getByEmail(String email);
    List<UserResponse> getAll();
}
