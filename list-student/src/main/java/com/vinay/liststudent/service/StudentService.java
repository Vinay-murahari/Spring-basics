package com.vinay.liststudent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinay.liststudent.entity.Student;
import com.vinay.liststudent.repository.StudentRepo;

@Service
public class StudentService{
	@Autowired
	private StudentRepo studentRepo;
	
	public StudentService(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}
	
	public List<Student> getAllStudents(){
		System.out.println("getAllStudents() called!!");
		return studentRepo.findAll();
	}
	public Student getStudentById(Integer sid) {
		System.out.println("getStudentById() called");
		Optional <Student> optional = studentRepo.findById(sid);
		Student student = null;
		if(optional.isPresent()) {
			student = optional.get();
		}else {
			throw new RuntimeException("Student not found:" + sid);
		}
		return student;
	}
	public void addStudent(Student student) {
		System.out.println("addStudent() is called");
		this.studentRepo.save(student);
	}
	
	public void updateStudent(Student update) {
		System.out.println("updateStudent() is called");
		Optional <Student> optional = studentRepo.findById(update.sid);
		Student student = null;
		if(optional.isPresent()) {
			student = optional.get();
		}else {
			throw new RuntimeException("Student not found:" + update.sid);
		}
		this.studentRepo.save(update);
		
	}
	
	public void deleteStudent(Integer sid) {
		System.out.println("deleteStudent() is called");
		this.studentRepo.deleteById(sid);
		
	}

}
