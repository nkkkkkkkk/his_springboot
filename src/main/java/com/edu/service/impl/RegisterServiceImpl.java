package com.edu.service.impl;

import com.edu.mapper.InvoiceMapper;
import com.edu.mapper.RegisterMapper;
import com.edu.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    private RegisterMapper registerMapper;
    @Override
    public String getMaxCaseNumber() {
        return registerMapper.getMaxCaseNumber();
    }
}
