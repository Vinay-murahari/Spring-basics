package com.vinay.dependencyinjection.Service;

import org.springframework.stereotype.Service;

@Service("SMSService")
public class SMSService implements MessageService {
	public void sendMessage(String message) {
		System.out.println(message);
	}

}
