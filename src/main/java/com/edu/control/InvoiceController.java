package com.edu.control;

import com.edu.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {
    @Autowired
    private InvoiceService invoiceService;
    @RequestMapping(value="/getMaxInvoiceNum",method = RequestMethod.GET)
    public String getMaxInvoiceNum(){
        return invoiceService.getMaxInvoiceNum();
    }
}
