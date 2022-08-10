package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.annotations.mypackage.Teacher;

@SpringBootApplication
public class AnnotationsApplication /*implements CommandLineRunner*/{
	
	@Autowired
	@Qualifier("stu 1")
	private student stu;
	
	@Autowired
	private Emp emp;
	@Autowired
	private Teacher teach;

	public static void main(String[] args) {
		SpringApplication.run(AnnotationsApplication.class, args);
	}

	//@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		this.stu.studying();
//		this.emp.myName();
//		this.teach.work();
//		
//	}

}
