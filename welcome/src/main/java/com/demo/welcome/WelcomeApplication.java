package com.demo.welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WelcomeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(WelcomeApplication.class, args);
		
		Student s = context.getBean(Student.class);
		s.show();
		
		}

}
