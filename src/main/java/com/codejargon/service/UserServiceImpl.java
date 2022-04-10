package com.codejargon.service;

import com.codejargon.exception.UserNotFoundException;
import com.codejargon.model.User;
import com.codejargon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public User findById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User with Id:"+ id + " not found."));
        return user;
    }
}
