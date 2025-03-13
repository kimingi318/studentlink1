package com.wiseowls.studentlink.Services;


import com.wiseowls.studentlink.Repositories.companyRepository;
import com.wiseowls.studentlink.models.company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class companyServiceimp implements companyService {


    @Autowired
    private companyRepository companyRepository;


    @Override
    public company saveCompany(company company) {
        return companyRepository.save(company);
    }

}
