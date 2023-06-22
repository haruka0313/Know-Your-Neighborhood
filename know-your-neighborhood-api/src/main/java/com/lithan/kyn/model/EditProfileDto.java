package com.lithan.kyn.model;

import javax.validation.constraints.NotBlank;


import lombok.Data;

@Data
public class EditProfileDto {
  @NotBlank
  private int userId;

  @NotBlank
  private String name;

  @NotBlank
  private String address;

  @NotBlank
  private String phoneNumber;


public EditProfileDto() {
	
}


public EditProfileDto(@NotBlank int userId, @NotBlank String name, @NotBlank String address,
		@NotBlank String phoneNumber) {
	super();
	this.userId = userId;
	this.name = name;
	this.address = address;
	this.phoneNumber = phoneNumber;
}


public int getUserId() {
	return userId;
}


public void setUserId(int userId) {
	this.userId = userId;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getPhoneNumber() {
	return phoneNumber;
}


public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}


@Override
public String toString() {
	return "EditProfileDto [userId=" + userId + ", name=" + name + ", address=" + address + ", phoneNumber="
			+ phoneNumber + "]";
}
  
  
}
