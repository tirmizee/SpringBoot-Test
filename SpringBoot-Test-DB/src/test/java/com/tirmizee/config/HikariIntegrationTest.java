package com.tirmizee.config;

import static org.assertj.core.api.Assertions.assertThat;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HikariIntegrationTest {
	
	@Autowired
    private DataSource dataSource;
	
	@Test
    public void hikariConnectionPoolIsConfigured() {
		assertThat("com.zaxxer.hikari.HikariDataSource").isEqualTo(dataSource.getClass().getName());
    }
	
}
