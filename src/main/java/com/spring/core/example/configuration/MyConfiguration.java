package com.spring.core.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.core.example.bean.MyBean;
import com.spring.core.example.repository.ClientDaoImpl;
import com.spring.core.example.service.ClientServiceImpl;

@Configuration
public class MyConfiguration {
	
	public MyConfiguration() {
		System.out.println("MyConfiguration instance created");
	}
	
	@Bean
	public MyBean myBean() {
		return new MyBean();
	}
	
	@Bean
	public ClientServiceImpl clientService1() {
		System.out.println("clientService1 instance created");
		
		ClientServiceImpl clientService = new ClientServiceImpl();
		clientService.setName("instancia client service 1");
		clientService.setClientDao(clientDao());
		return clientService;
	}
	
	@Bean
	public ClientServiceImpl clientService2() {
		System.out.println("clientService2 instance created");
		
		ClientServiceImpl clientService = new ClientServiceImpl();
		clientService.setName("instancia client service 2");
		clientService.setClientDao(clientDao());
		return clientService;
	}
	
	@Bean
	public ClientDaoImpl clientDao() {
		return new ClientDaoImpl();
	}
}
