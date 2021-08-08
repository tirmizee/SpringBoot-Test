package com.tirmizee.service;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {

	@Override
	public int add(Integer... numbers) {
		
		if (numbers == null || numbers.length == 0) {
			return 0;
		}
		
		int sum = 0;
		for (Integer number : numbers) {
			sum += number;
		}
		
		return sum;
	}
	
}
