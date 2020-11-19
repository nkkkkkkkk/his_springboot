package com.edu.mapper;

import com.edu.javaBean.Register;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterMapper {
    //获取最大病历号
    String getMaxCaseNumber();

    int deleteByPrimaryKey(Integer id);

    int insert(Register record);

    int insertSelective(Register record);

    Register selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Register record);

    int updateByPrimaryKey(Register record);
}