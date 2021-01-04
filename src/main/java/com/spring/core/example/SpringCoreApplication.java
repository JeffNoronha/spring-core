package com.spring.core.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.core.example.bean.MyBean;
import com.spring.core.example.bean.MyComponent;
import com.spring.core.example.service.ClientServiceImpl;
import com.spring.core.example.service.MathService;

@SpringBootApplication
public class SpringCoreApplication {

	@Autowired
	private MyBean myBean;
	
	@Autowired
	private ClientServiceImpl clientService1;
	
	@Autowired
	private ClientServiceImpl clientService2;
	
	@Autowired
	@Qualifier("clientService2")
	private ClientServiceImpl clientService20;
	
	@Autowired
	private MyComponent myComponent;
	
	@Autowired
	private MathService service;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		System.out.println(myBean.getText());
		
		System.out.println("clientService1 = " + clientService1.toString() + " (" + clientService1.getName() + ")");
		System.out.println(" " + clientService1.getClientDao().toString());
		System.out.println("clientService2 = " + clientService2.toString() + " (" + clientService2.getName() + ")");
		System.out.println(" " + clientService2.getClientDao().toString());
		
		myComponent.print();
		System.out.println(service.add(10, 20));
		System.out.println(service.subtract(50, 14));
	}
}
