package com.vinay.liststudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vinay.liststudent.entity.Student;
import com.vinay.liststudent.service.StudentService;

@SpringBootApplication
public class ListStudentApplication {

	public static void main(String[] args) {
//		ApplicationContext applicationContext = SpringApplication.run(ListStudentApplication.class, args);
//		StudentService studentService = applicationContext.getBean(StudentService.class);
//		studentService.addStudent(new Student(106,"Vaishali","Tha","Mauritius"));
//		studentService.getAllStudents();
		SpringApplication.run(ListStudentApplication.class, args);

		
	}

}
