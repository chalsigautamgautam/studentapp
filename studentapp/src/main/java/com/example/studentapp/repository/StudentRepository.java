package com.example.studentapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentapp.entity.StudentClass;

public interface StudentRepository extends JpaRepository<StudentClass, Integer>{

}

