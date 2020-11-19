package com.edu.control;

import com.edu.service.InvoiceService;
import com.edu.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    @Autowired
    private RegisterService registerService;
    @RequestMapping(value="/getMaxCaseNumber",method = RequestMethod.GET)
    public String  getMaxCaseNumber(){
        return registerService.getMaxCaseNumber();
    }
}
