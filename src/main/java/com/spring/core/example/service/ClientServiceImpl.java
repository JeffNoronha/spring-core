package com.spring.core.example.service;

import com.spring.core.example.repository.ClientDaoImpl;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientServiceImpl {

	private String name;
	private ClientDaoImpl clientDao;
	
}
