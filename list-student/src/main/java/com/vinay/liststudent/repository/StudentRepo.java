package com.vinay.liststudent.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinay.liststudent.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	List<Student> getAllStudents();

}
