package com.tirmizee.config;

import static org.assertj.core.api.Assertions.assertThat;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
public class DatabaseIntegretionTest {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Test
    public void dataSourceIsConfigured() {
		assertThat(dataSource).isNotNull();
    }
	
	@Test
    public void jdbcTemplateIsConfigured() {
		assertThat(jdbcTemplate).isNotNull();
    }
	
}
