package com.example.springdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping(value = "/test")
	public ResponseEntity<Object> test(){
		return  new ResponseEntity<>("test",HttpStatus.OK);
	}
}
