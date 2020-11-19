package com.edu.service.impl;


import com.edu.javaBean.User;
import com.edu.mapper.UserMapper;
import com.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username,String password)
    {

        return userMapper.userLogin(username,password);
    }

    @Override
    public List<User> getAllUsers(String keywords) {
        return userMapper.getAllUsers(keywords);
    }
    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);

    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int deleteUserById(int id) {
        return userMapper.deleteUserById(id);
    }
}
