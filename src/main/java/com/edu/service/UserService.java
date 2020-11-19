package com.edu.service;

import com.edu.javaBean.User;

import java.util.List;

public interface UserService {
    //登录

    public User login(String username, String password);

    public List<User> getAllUsers(String keywords);
    public int addUser(User user);

    public int updateUser(User user);

    public int deleteUserById(int id);
}
