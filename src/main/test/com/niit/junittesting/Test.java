package com.niit.junittesting;

import com.niit.models.User;

public class Test {
	
	
	public String validate(String id, String password) {
		// TODO Auto-generated method stub
    	//select *
    	String hql="from User where id= '"+id+"'and password ='"+password+"'";
		return hql;
	}

}
