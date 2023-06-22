package com.lithan.kyn.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;


@Data
public class LoginDto {

  @Email
  @NotBlank(message = "Email is required")
  private String email;

  @NotBlank(message = "Password is required")
  private String password;

/**
 * 
 */
public LoginDto() {
	
}

public LoginDto(@Email @NotBlank(message = "Email is required") String email,
		@NotBlank(message = "Password is required") String password) {
	super();
	this.email = email;
	this.password = password;
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

@Override
public String toString() {
	return "LoginDto [email=" + email + ", password=" + password + "]";
}


  
}
