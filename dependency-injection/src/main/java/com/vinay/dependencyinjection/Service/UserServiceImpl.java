package com.vinay.dependencyinjection.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	private MessageService messageService;
	
	@Autowired
	@Qualifier("TwitterService")
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	
	public void processMessage(String message) {
		messageService.sendMessage(message);
	}

}
