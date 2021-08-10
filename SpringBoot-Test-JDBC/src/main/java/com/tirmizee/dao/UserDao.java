package com.tirmizee.dao;

import com.tirmizee.dto.UserDTO;

public interface UserDao {
	
	UserDTO getByFirstname(String firstname);

}
