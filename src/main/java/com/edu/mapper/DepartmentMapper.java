package com.edu.mapper;

import com.edu.javaBean.Department;
import com.edu.javaBean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    List<Department> getAllDepartments(@Param("keywords") String keywords);
    int deleteDepartmentById(@Param("id") int id);
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);


}