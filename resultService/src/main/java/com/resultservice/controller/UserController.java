package com.resultservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resultservice.dto.SigninDto;
import com.resultservice.dto.SignupDto;
import com.resultservice.service.UserService;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired UserService userService;
	
	@GetMapping("/signin/{username}/{password}")
	public SigninDto getUser(@PathVariable String username,@PathVariable String password) {
		return userService.getUser(username, password);
		
	}
	
	@PostMapping("/user/signup")
	public ResponseEntity<String> saveUser(@RequestBody SignupDto signupdto) {
	    userService.saveUser(signupdto);
	    return ResponseEntity.ok("User created successfully !");
	}

}
