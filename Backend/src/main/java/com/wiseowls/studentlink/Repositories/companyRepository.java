package com.wiseowls.studentlink.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wiseowls.studentlink.models.company;

@Repository
public interface companyRepository extends JpaRepository<company, Long> {

    
}