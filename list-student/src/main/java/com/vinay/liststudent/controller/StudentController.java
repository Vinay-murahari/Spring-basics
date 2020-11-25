package com.vinay.liststudent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.liststudent.entity.Student;

@RestController
@RequestMapping("/studentapi")
public class StudentController {
	
//	@Autowired
//	private StudentService studentRepo;
//
//	@GetMapping("/allstudents")
//	public void getAllStudents(){
//		return; 
//	}
//	
//	@PostMapping("/updatestudent")
//	public void updateStudent(Student update) {
//		return;
//	}
//	@PostMapping("/addStudent")
//	public void addStudent(Student student) {
//		return;
//	}
//	
}
