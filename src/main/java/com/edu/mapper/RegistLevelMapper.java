package com.edu.mapper;

import com.edu.javaBean.RegistLevel;

public interface RegistLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RegistLevel record);

    int insertSelective(RegistLevel record);

    RegistLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RegistLevel record);

    int updateByPrimaryKey(RegistLevel record);
}