package com.tirmizee.properties;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("prod")
public class PropertiesProdTest {

	@Value("${endpoint.url}") 
	private String endpointUrl;
	
	@Test
	void endpointUrl_withActiveProfile_shouldReturnValue() {
	
		// given
		final String expectedResult = "https://prod.api.com";
		
		// when
		final String actualResult = endpointUrl;
	
		// then
		assertThat(actualResult).isEqualTo(expectedResult);
		
	}
	
}
