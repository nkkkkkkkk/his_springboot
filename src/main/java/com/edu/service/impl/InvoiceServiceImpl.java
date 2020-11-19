package com.edu.service.impl;

import com.edu.javaBean.Invoice;
import com.edu.mapper.InvoiceMapper;
import com.edu.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {
    @Autowired
    private InvoiceMapper invoiceMapper;
    @Override
    public String getMaxInvoiceNum() {
        return invoiceMapper.getMaxInvoiceNum();
    }
}
