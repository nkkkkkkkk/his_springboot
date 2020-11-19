package com.edu.service;

import com.edu.javaBean.ConstantItem;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ConstantItemService {
    List<ConstantItem> getAllConstItem(String keywords);
}
