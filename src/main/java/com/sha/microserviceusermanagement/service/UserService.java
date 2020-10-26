package com.sha.microserviceusermanagement.service;

import com.sha.microserviceusermanagement.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User save(User user);

    User findByUsername(String username);

    List<String> findUsers(List<Long> idList);
}
