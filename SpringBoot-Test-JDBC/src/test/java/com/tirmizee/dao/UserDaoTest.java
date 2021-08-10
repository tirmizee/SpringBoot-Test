package com.tirmizee.dao;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import com.tirmizee.dto.UserDTO;

@SpringBootTest
@Sql(scripts = {
	"classpath:databases/schema.sql",
	"classpath:databases/data.sql"
})
public class UserDaoTest {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	void getByUsername_shouldReturnUser() {
		
		// Given
		final String firstname = "Pratya";
		
		// when 
		UserDTO actaulResult = userDao.getByFirstname(firstname);
		
		//then
		assertThat(actaulResult).isNotNull();
		
	}

}
