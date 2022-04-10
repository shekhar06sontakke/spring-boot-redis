package com.codejargon.service;

import com.codejargon.model.User;
import org.springframework.stereotype.Service;



public interface UserService {

    User findById(Long id);
}
