package com.lithan.kyn.model;

import com.lithan.kyn.entity.UserAccount;

import lombok.Data;


@Data
public class UserDto {
  private int userId;

  private String name;

  private String email;

  private String imageUrl;

  private String address;

  private String phoneNumber;

  private String provider;

  public UserDto(UserAccount user) {
    this.userId = user.getUserId();
    this.name = user.getName();
    this.email = user.getEmail();
    this.imageUrl = user.getImageUrl();
    this.address = user.getAddress();
    this.phoneNumber = user.getPhoneNumber();
    this.provider = user.getProvider().toString();
  }


public UserDto() {

}


/**
 * @param userId
 * @param name
 * @param email
 * @param imageUrl
 * @param address
 * @param phoneNumber
 * @param provider
 */
public UserDto(int userId, String name, String email, String imageUrl, String address, String phoneNumber,
		String provider) {
	super();
	this.userId = userId;
	this.name = name;
	this.email = email;
	this.imageUrl = imageUrl;
	this.address = address;
	this.phoneNumber = phoneNumber;
	this.provider = provider;
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


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getImageUrl() {
	return imageUrl;
}


public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
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


public String getProvider() {
	return provider;
}


public void setProvider(String provider) {
	this.provider = provider;
}


@Override
public String toString() {
	return "UserDto [userId=" + userId + ", name=" + name + ", email=" + email + ", imageUrl=" + imageUrl + ", address="
			+ address + ", phoneNumber=" + phoneNumber + ", provider=" + provider + "]";
}
  
  

}
