package com.edu.service.impl;


import com.edu.javaBean.Department;
import com.edu.javaBean.User;
import com.edu.mapper.DepartmentMapper;
import com.edu.mapper.UserMapper;
import com.edu.service.DepartmentService;
import com.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAllDepartments(String keywords) {
        return departmentMapper.getAllDepartments(keywords);
    }

    @Override
    public int addDepartment(Department department) {
        return departmentMapper.insertSelective(department);
    }

    @Override
    public int updateDepartment(Department department) {
        return departmentMapper.updateByPrimaryKeySelective(department);
    }

    @Override
    public int deleteDepartmentById(int id) {
        return departmentMapper.deleteDepartmentById(id);
    }
}
