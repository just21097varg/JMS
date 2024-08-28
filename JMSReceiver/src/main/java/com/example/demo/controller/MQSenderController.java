package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MQSenderService;

@RestController
public class MQSenderController {
	
	@Autowired
	MQSenderService mqSenderService;

	@GetMapping("/send/{name}")
	public String sendMsg(@PathVariable("name") String name) {
		mqSenderService.sendMsg(name);
		return name;
	}
}
