package com.pk.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pk.entity.Student;

public interface IStudentDao extends JpaRepository<Student, Integer> {

}
