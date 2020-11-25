//package com.vinay.liststudent.aspect;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class StudentAspect {
//	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
//	
//	@Before("execution(* com.vinay.liststudent.service.StudentService.*(..))")
//	public void logBeforeAllMethods(JoinPoint joinPoint) {
//		LOGGER.debug("****LoggingAspect.logBeforeAllMethods(): " + joinPoint.getSignature().getName());
//	}
//	@Before("execution(* com.vinay.liststudent.service.StudentService.getStudentById(..))")
//	public void logBeforeGetStudent(JoinPoint joinPoint) {
//		LOGGER.debug("****LoggingAspect.logBeforeGetStudent():" + joinPoint.getSignature().getName());
//	}
//	@Before("execution(* com.vinay.liststudent.service.StudentService.addStudent(..))")
//	public void logBeforeAddStudent(JoinPoint joinPoint) {
//		LOGGER.debug("****LoggingAspect.logBeforeAddStudent():" + joinPoint.getSignature().getName());
//	}
//	@After("execution(* com.vinay.liststudent.service.StudentService.*(..))")
//	public void logAfterAllMethods(JoinPoint joinPoint) {
//		LOGGER.debug("****LoggingAspect.logAfterAllMethods(): " + joinPoint.getSignature().getName());
//	}
//	@After("execution(* com.vinay.liststudent.service.StudentService.getStudentById(..))")
//	public void logAfterGetStudent(JoinPoint joinPoint) {
//		LOGGER.debug("****LoggingAspect.logAfterGetStudent():" + joinPoint.getSignature().getName());
//	}
//	@After("execution(* com.vinay.liststudent.service.StudentService.addStudent(..))")
//	public void logAfterAddStudent(JoinPoint joinPoint) {
//		LOGGER.debug("****LoggingAspect.logAfterAddStudent():" + joinPoint.getSignature().getName());
//	}
//
//}
