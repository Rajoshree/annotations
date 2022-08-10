package com.annotations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.annotations.student;

@RestController
@RequestMapping("/wrt")
public class MyController {
	
	@Autowired
	@Qualifier("stu 1")
	private student st;
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public student print() { //@RequestBody student st
		
		this.st.studying();
		System.out.println("This is method");
		this.st.setString("Rajoshree");
		this.st.studying();
		
		return st;  /// if return this.st it will print Rajoshree coz it will refer to class object		
		
	}

}
