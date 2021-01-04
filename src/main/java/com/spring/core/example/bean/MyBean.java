package com.spring.core.example.bean;

import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;

@Getter
public class MyBean {
	
	@Value("Default value for field")
	private String text;
	
	public MyBean() {
		System.out.println("MyBean instance created");
	}
}
