package com.ronit.ecommerce_multivendor.service;

import com.ronit.ecommerce_multivendor.dto.request.LoginRequest;
import com.ronit.ecommerce_multivendor.dto.response.LoginResponse;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);



}
