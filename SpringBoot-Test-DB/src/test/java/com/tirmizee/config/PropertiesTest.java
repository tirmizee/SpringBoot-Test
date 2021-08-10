package com.tirmizee.config;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertiesTest {
	
	@Value("${ping}")
	private String ping;
	
	@Test
    public void hikariConnectionPoolIsConfigured() {
		assertThat("pong").isEqualTo(ping);
    }

}
