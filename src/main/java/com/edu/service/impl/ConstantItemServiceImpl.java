package com.edu.service.impl;

import com.edu.javaBean.ConstantItem;
import com.edu.mapper.ConstantItemMapper;
import com.edu.service.ConstantItemService;
import com.edu.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConstantItemServiceImpl implements ConstantItemService {
    @Autowired
    private ConstantItemMapper constMapper;
    @Override
    public List<ConstantItem> getAllConstItem(String keywords) {
        System.out.print("impl-------"+keywords);
//        List<ConstantItem> l = constMapper.getAllConstItem(keywords);
//        for(ConstantItem c:l){
//            System.out.print(c);
//        }
        return constMapper.getAllConstItem(keywords);
    }
}
