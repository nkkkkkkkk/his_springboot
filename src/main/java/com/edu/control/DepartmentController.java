package com.edu.control;

import com.edu.javaBean.Department;
import com.edu.javaBean.User;
import com.edu.service.DepartmentService;
import com.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @RequestMapping(value = "/getAllDepartments",method = RequestMethod.GET)
    public List<Department> getDepartments(@RequestParam String keywords){
        System.out.print("关键字："+keywords);
        return departmentService.getAllDepartments(keywords);
    }
    @RequestMapping(value = "/addDepartment",method = RequestMethod.POST)
    public Map<String,Object> addUser(@RequestBody Department department){
        System.out.println(department);
        Map<String,Object> map=new HashMap<>();
        int i =departmentService.addDepartment(department);
        if(i>0){
            map.put("msg","科室添加成功");
        }
        else{
            map.put("msg","科室添加失败");
        }
        return map;
    }
    @RequestMapping(value="/updateDepartment",method = RequestMethod.POST)
    public Map<String,Object> updateDepartment(@RequestBody Department department){
        Map<String,Object> map=new HashMap<>();
        int i =departmentService.updateDepartment(department);
        if(i>0){
            map.put("msg","科室修改成功");
        }
        else{
            map.put("msg","科室修改失败");
        }

        return map;
    }
    @RequestMapping(value="/deleteDepartmentById",method = RequestMethod.GET)
    public Map<String,Object> deleteUserById(@RequestParam int id){
        Map<String,Object> map=new HashMap<>();
        int i =departmentService.deleteDepartmentById(id);
        if(i>0){
            map.put("msg","科室删除成功");
        }
        else{
            map.put("msg","科室删除失败");
        }

        return map;
    }

}
