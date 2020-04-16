package com.nttdata.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {

	@NotEmpty(message="Name can't be empty")
	private String name;
	
	@Min(value = 18,message="not permitted for<18")
	@Max(value = 50,message="not permitted> 120")
	@NotNull(message="not null")
	private Integer age;
	
	@NotEmpty(message="no empty email")
	@Email(message="Enter  thevalid email")
	private String email;
	
	
	@NotNull(message="no empty password")
	private String Password;
	
	public User(String name, Integer age, String email, String Password) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		
		this.Password = Password;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public User() {
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
