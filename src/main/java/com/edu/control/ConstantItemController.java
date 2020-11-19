package com.edu.control;

import com.edu.javaBean.ConstantItem;
import com.edu.service.ConstantItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConstantItemController {
    @Autowired
    private ConstantItemService constantitemService;

    @RequestMapping(value = "/getAllConstItem",method = RequestMethod.GET)
    public List<ConstantItem> getConstItem(@RequestParam String keywords){
        System.out.print("关键字："+keywords);
        return constantitemService.getAllConstItem(keywords);
    }








}
