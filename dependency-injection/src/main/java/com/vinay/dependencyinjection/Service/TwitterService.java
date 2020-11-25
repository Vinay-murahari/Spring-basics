package com.vinay.dependencyinjection.Service;

import org.springframework.stereotype.Service;

@Service("TwitterService")
public class TwitterService implements MessageService {
	public void sendMessage(String message) {
		System.out.println("message");
	}

}
