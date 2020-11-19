package com.edu.service;

import com.edu.javaBean.Department;
import com.edu.javaBean.User;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface DepartmentService {

    public List<Department> getAllDepartments(String keywords);
    public int addDepartment(Department department);

    public int updateDepartment(Department department);

    public int deleteDepartmentById(int id);
}
