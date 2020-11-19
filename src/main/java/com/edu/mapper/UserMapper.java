package com.edu.mapper;

import com.edu.javaBean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    //登录
    User userLogin(@Param("uname") String username,@Param("upass") String password);
    List<User> getAllUsers(@Param("keywords") String keywords);
    int deleteUserById(@Param("id") int id);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);



}