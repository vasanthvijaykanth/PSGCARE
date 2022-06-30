package com.journal.journal.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.journal.journal.dao.UserRepository;
import com.journal.journal.dto.UserDto;
import com.journal.journal.entity.User;
import com.journal.journal.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);
	@Autowired
	UserRepository repository;
	@Override
	public Boolean saveUser(UserDto request) {
		// TODO Auto-generated method stub
		Boolean status = false;
		try {
			User user = new User();
			user.setFirstName(request.getFirstName());
			user.setLastName(request.getLastName());

			repository.save(user);
	
			status = true;
		}catch(Exception e) {
			logger.error(e);
		}
				
		return status;
	}

}
