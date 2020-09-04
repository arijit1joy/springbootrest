package com.example.springdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.models.SampleResponse;

@RestController
public class TestController {
	@RequestMapping(value = "/test")
	public ResponseEntity<Object> test(){
		return  new ResponseEntity<>("test",HttpStatus.OK);
	}
	@RequestMapping(value = "/sample")
	public SampleResponse Sample() {
		SampleResponse res=new SampleResponse();
		res.setId(1);
		res.setMessage("This is testing");
		return res;
	}
}
