package com.hotelrating.user.service.service;

import com.hotelrating.user.service.entity.User;

import java.util.List;

public interface  UserService {

    // create
    User saveUser(User user);

    // get all users
    List<User> getUsers();

    // get single user of given userId
    User getUser(String userId);

    // add other possible operations...
}
