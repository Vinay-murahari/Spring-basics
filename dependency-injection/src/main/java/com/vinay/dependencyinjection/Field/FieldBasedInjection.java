//package com.vinay.dependencyinjection.Field;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//import com.vinay.dependencyinjection.Service.MessageService;
//
//@Component
//public class FieldBasedInjection {
//	
//	
//	@Autowired
//	@Qualifier("TwitterService")
//	private MessageService messageService;
//	
//	public void processMessage(String message) {
//		messageService.sendMessage(message);
//	}
//	
//
//}
