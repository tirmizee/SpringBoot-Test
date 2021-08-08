package com.tirmizee.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculateServiceTest {
	
	@Autowired
    private CalculateService calculateService;
	
	@Test
	void C001_add() {
		
		Integer inputs[] = new Integer[] {1,2,3,4,5,6,7,8,9};
		
		int expectedResult = 45;
		
		int actual = calculateService.add(inputs);
		
		assertThat(actual).isEqualTo(expectedResult);
	}

}
