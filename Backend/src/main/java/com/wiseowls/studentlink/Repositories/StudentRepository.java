package com.wiseowls.studentlink.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wiseowls.studentlink.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByUsername(String username);
}