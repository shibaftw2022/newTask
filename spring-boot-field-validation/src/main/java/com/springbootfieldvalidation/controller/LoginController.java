package com.springbootfieldvalidation.controller;

import com.springbootfieldvalidation.dto.LoginResponseDTO;
import com.springbootfieldvalidation.model.User;
import com.springbootfieldvalidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {

	@Autowired
	UserService userService;
	@GetMapping
	public LoginResponseDTO login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password){
		return userService.getUser(username,password);
	}
}