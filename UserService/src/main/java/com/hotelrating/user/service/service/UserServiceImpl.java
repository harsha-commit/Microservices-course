package com.hotelrating.user.service.service;

import com.hotelrating.user.service.entity.User;
import com.hotelrating.user.service.exception.ResourceNotFoundException;
import com.hotelrating.user.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.List;

public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException());
    }
}
