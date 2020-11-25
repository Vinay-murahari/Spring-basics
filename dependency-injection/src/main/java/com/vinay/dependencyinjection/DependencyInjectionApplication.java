package com.vinay.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vinay.dependencyinjection.config.AppConfig;
import com.vinay.dependencyinjection.constructor.ConstructorBasedInjection;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ConstructorBasedInjection fieldBasedInjection = context.getBean(ConstructorBasedInjection.class);
		fieldBasedInjection.processMessage("twitter is Sending the message");
		
	}

}
