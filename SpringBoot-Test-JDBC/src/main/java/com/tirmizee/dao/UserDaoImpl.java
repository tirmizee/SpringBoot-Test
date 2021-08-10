package com.tirmizee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tirmizee.dto.UserDTO;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public UserDTO getByFirstname(String firstname) {
		try {
			return jdbcTemplate.queryForObject("SELECT * FROM users WHERE firstname = ?", BeanPropertyRowMapper.newInstance(UserDTO.class), firstname);
		} catch (EmptyResultDataAccessException e) {
			return null;
		} catch (Exception e) {
			throw e;
		}
	}
	
}
