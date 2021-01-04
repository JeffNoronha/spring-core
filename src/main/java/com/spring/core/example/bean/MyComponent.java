package com.spring.core.example.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

	@Value("${example.propertie.value.host}")
	public String HOST;
	
	public MyComponent() {
		System.out.println("MyComponent instance created");
	}
	
	public void print() {
		System.out.println("Using my componente");
		System.out.println(HOST);
	}
}
