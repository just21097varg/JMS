package com.example.demo.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MQReceiverService {

	@JmsListener(destination="JMS-Receiver")
	public void getMessage(String message) {
		System.out.println("This is message received from JMS-Receiver ---- "+message);
	}
}
