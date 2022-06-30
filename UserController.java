package com.journal.journal.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.journal.journal.dto.UserDto;
import com.journal.journal.service.UserService;

@RestController
@RequestMapping("api/v1/psg")
@CrossOrigin
public class UserController {

	private static Logger logger = LogManager.getLogger(UserController.class);
	
	@Autowired
	UserService service;
	
	@PostMapping(value = "/saveUser", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Boolean> saveUser(@RequestBody UserDto userDto){
		
		Boolean userData = false;
		userData = service.saveUser(userDto);
		return new ResponseEntity<Boolean> (userData, HttpStatus.OK);
	}
}
