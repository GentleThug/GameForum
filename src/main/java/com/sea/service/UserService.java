package com.sea.service;

import com.sea.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();
    Boolean addUser(User user);
}
