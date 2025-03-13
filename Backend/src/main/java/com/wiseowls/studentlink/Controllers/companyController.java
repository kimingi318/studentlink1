package com.wiseowls.studentlink.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiseowls.studentlink.Services.companyService;
import com.wiseowls.studentlink.models.company;

@RestController
@RequestMapping("/company")
public class companyController {

    @Autowired
    private companyService companyService;



    @PostMapping("/register")
    public String registerCompany(@RequestBody company company) {
        companyService.saveCompany(company);
        return "Company registered successfully";
    }

}
