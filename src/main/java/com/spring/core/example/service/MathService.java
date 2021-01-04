package com.spring.core.example.service;

import org.springframework.stereotype.Service;

@Service
public class MathService {

	public int add(int x, int y) {
		return x + y;
	}
	
	public int subtract(int x, int y) {
		return x - y;
	}
}
