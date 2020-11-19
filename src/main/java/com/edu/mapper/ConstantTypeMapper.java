package com.edu.mapper;

import com.edu.javaBean.ConstantType;

public interface ConstantTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConstantType record);

    int insertSelective(ConstantType record);

    ConstantType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConstantType record);

    int updateByPrimaryKey(ConstantType record);
}