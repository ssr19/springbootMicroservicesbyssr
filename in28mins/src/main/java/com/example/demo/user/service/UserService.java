package com.example.demo.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.demo.user.dao.User;
@Service
public class UserService {

	static List list = new ArrayList();
	
	public List<User> getAllUsers() {
		
		
		return list;
	}
	
	public String createNewUser() {
		User user=new User();
		user.setId(new Random().nextInt());
		user.setName("Jai jagannath");
		user.setAge(40);
		/*
		 * User user1=new User(); user.setId(1); user.setName("Jai Shri Krishna");
		 * user.setAge(41);
		 * 
		 * User user2=new User(); user.setId(2); user.setName("Jai Maa");
		 * user.setAge(42);
		 */
		addNewUserInList(user);
		/*
		 * addNewUserInList(user1); addNewUserInList(user2);
		 */
		return "User Created";
	}
	
	public void addNewUserInList(User user) {
		
		list.add(user);
		
	}
	
	
}
