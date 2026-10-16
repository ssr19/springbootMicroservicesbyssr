package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.user.dao.User;
import com.example.demo.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping(path = "/hello")
	public String helloworld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/getUsers")
	public List<User> getUsers() {
		userService.createNewUser();
		return userService.getAllUsers();
	}
}
