package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MQSenderService {
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	public void sendMsg(String name) {
		jmsTemplate.convertAndSend("JMS-Sender",name);
	}

}
