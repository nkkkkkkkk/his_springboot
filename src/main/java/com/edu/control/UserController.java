package com.edu.control;

import com.edu.javaBean.User;
import com.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class UserController {
    @Autowired
    private UserService userService;

   @RequestMapping("/userLogin")
    public Map<String,Object> login(@RequestBody Map<String,String> map){
       System.out.print(map+"---------------------");
       String uname=map.get("username");
       String pass=map.get("password");
       System.out.print("用户名为"+uname+",密码："+pass);
       User user =userService.login(uname,pass);
       Map<String,Object> resMap=new HashMap<>();
       if(user!=null)
       {resMap.put("msg","登陆成功");
        resMap.put("userInfo",user);
       }
       else{
           resMap.put("msg","登陆失败");
       }
       return resMap;
   }

    @RequestMapping(value = "/getAllUsers",method = RequestMethod.GET)
    public List<User> getUsers(@RequestParam String keywords){
        System.out.print("关键字："+keywords);
        return userService.getAllUsers(keywords);
    }
//    @RequestMapping(value = "/getAllUsers",method = RequestMethod.POST)
//    @ResponseBody
//    public List<User> getUsers(@RequestBody  Map<String,String> map){
//         System.out.print("关键字："+map.get("keywords"));
//        return userService.getAllUsers(map.get("keywords"));
//    }
   @RequestMapping(value = "/addUser",method = RequestMethod.POST)
   public Map<String,Object> addUser(@RequestBody User user){
       System.out.println(user);
       Map<String,Object> map=new HashMap<>();
       int i =userService.addUser(user);
       if(i>0){
           map.put("msg","用户添加成功");
       }
       else{
           map.put("msg","用户添加失败");
       }
       return map;
   }
   @RequestMapping(value="/updateUser",method = RequestMethod.POST)
    public Map<String,Object> updateUser(@RequestBody User user){
       Map<String,Object> map=new HashMap<>();
       int i =userService.updateUser(user);
       if(i>0){
           map.put("msg","用户修改成功");
       }
       else{
           map.put("msg","用户修改失败");
       }

       return map;
   }

    @RequestMapping(value="/deleteUserById",method = RequestMethod.GET)
    public Map<String,Object> deleteUserById(@RequestParam int id){
        Map<String,Object> map=new HashMap<>();
        int i =userService.deleteUserById(id);
        if(i>0){
            map.put("msg","用户删除成功");
        }
        else{
            map.put("msg","用户删除失败");
        }

        return map;
    }
}
