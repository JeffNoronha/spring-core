package com.spring.core.example.service;

import org.springframework.stereotype.Service;

import com.spring.core.example.repository.MyRepository;

@Service
public class MyService {

	private MyRepository repository;

	public MyService(MyRepository repository) {
		System.out.println("MyService instance created");
		System.out.println("MyRepository " + repository.toString());
		this.repository = repository;
	}
	
	public void doSomething() {
		repository.doSomething();
	}
}
