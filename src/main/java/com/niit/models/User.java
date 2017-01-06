package com.niit.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="C_USER_DETAILS")
public class User {
	@Id
	private String id;
	private String name;
	private String email;
	private String password;
	private String mobile;
	private String batch;
	private String Address;
	private String role;
	@Column(name="is_Online")
	private char is_Online;
	private char status;
	private String reason;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public char getIs_Online() {
		return is_Online;
	}
	public void setIs_Online(char is_Online) {
		this.is_Online = is_Online;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setErrorCode(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setErrorMessage(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
