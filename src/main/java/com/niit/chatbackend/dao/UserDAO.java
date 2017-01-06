package com.niit.chatbackend.dao;

import java.util.List;

import com.niit.models.User;

public interface UserDAO {
	//curd operation and validations
	//list of all users,save, update ,displayed
	public List<User> list();
	//access_specifier return_type mehod_name (parameter list)
     public boolean save(User user);
     public boolean update(User user);
     public User get(String id);
     //validate for tseting if user xit then user obj else null
     public User validate(String id,String password);
     
}
