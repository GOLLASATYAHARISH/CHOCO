package com.niit.chatbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.chatbackend.dao.impl.UserDAOImpl;
import com.niit.models.User;



@RestController
public class UserController {
	@Autowired
	User user;
	
	@Autowired
	UserDAOImpl uDAO;
	
	@RequestMapping(value="/AddUsers",method=RequestMethod.POST,headers="accept=appliacation/json")
	public void save(@RequestBody User u){
		
	 uDAO.save(u);
	
		
		
	}
	
	/*
	@RequestMapping("/USERS")
  public ResponseEntity<List<User>> getAllUsers()
  {
	  List<User> users = user.list();
	  if(users.isEmpty()){
		  user.setErrorCode("404");
		  user.setErrorMessage("no users found");
		  users.add(user);
	  }
	return new ResponseEntity<List<User>>(users, HttpStatus.OK);
  }
	
	//take aluminies fronmtaht list
	// take student from that list
	@RequestMapping("/USER/{id}")
	public ResponseEntity<User> getUserId(@PathVariable("id") String userId)
	{
		
		user =uDAO.get(userId);
		
		if(user==null){
			user=new User();
			  user.setErrorCode("404");
			  user.setErrorMessage("user doent exit with id"+userId);
			 
		  }
		
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	@RequestMapping(value="/Atenticate/",method=RequestMethod.POST)
	public ResponseEntity<User> getAthenticate(@RequestBody User u)
	{
	   
		u =uDAO.validate(user.getId(),user.getPassword());
		
		if(user==null){
			user=new User();
			  user.setErrorCode("404");
			  user.setErrorMessage("userid or password not match for given");
			 
		  }
		
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}
	
	
*/	
}
