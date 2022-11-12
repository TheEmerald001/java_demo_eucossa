/**
 * 
 */
package com.example.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.learning.entities.UserDetails;
import com.example.learning.service.UserService;

import javax.transaction.Transactional;

/**
 * @author DccLxxVii
 *
 */
@RestController
@Transactional
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public ResponseEntity<Object> userDetails(){
		
		List<UserDetails> userDetails = userService.getUserDetails();
		
		return new ResponseEntity<>(userDetails, HttpStatus.OK);
	}

	@PostMapping("/addUser")
	public ResponseEntity<Object> addUser(@RequestBody UserDetails userDetails){
		userService.createUser(userDetails);
		return new ResponseEntity<>("User Created",HttpStatus.CREATED);
	}
}
