package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.dto.UserRegistrationDto;
import com.example.employeemanagementsystem.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);


}
