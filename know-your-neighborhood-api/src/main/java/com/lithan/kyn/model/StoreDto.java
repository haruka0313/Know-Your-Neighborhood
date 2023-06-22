package com.lithan.kyn.model;

import com.lithan.kyn.entity.Store;


import lombok.Data;


@Data
public class StoreDto {

  private int storeId;

  private String storeName;

  private String country;

  private String city;

  private String storeEmail;

  private String phoneNumber;

  private String imageUrl;

  private String description;

  private UserDto user;

  public StoreDto(Store store) {
    this.storeId = store.getStoreId();
    this.storeName = store.getStoreName();
    this.country = store.getCountry();
    this.city = store.getCity();
    this.storeEmail = store.getStoreEmail();
    this.phoneNumber = store.getPhoneNumber();
    this.imageUrl = store.getImageUrl();
    this.description = store.getDescription();
    this.user = new UserDto(store.getUser());
  }


public StoreDto() {
	
}

public StoreDto(int storeId, String storeName, String country, String city, String storeEmail, String phoneNumber,
		String imageUrl, String description, UserDto user) {
	super();
	this.storeId = storeId;
	this.storeName = storeName;
	this.country = country;
	this.city = city;
	this.storeEmail = storeEmail;
	this.phoneNumber = phoneNumber;
	this.imageUrl = imageUrl;
	this.description = description;
	this.user = user;
}


public int getStoreId() {
	return storeId;
}


public void setStoreId(int storeId) {
	this.storeId = storeId;
}


public String getStoreName() {
	return storeName;
}


public void setStoreName(String storeName) {
	this.storeName = storeName;
}


public String getCountry() {
	return country;
}


public void setCountry(String country) {
	this.country = country;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getStoreEmail() {
	return storeEmail;
}


public void setStoreEmail(String storeEmail) {
	this.storeEmail = storeEmail;
}


public String getPhoneNumber() {
	return phoneNumber;
}


public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}


public String getImageUrl() {
	return imageUrl;
}


public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


public UserDto getUser() {
	return user;
}


public void setUser(UserDto user) {
	this.user = user;
}


@Override
public String toString() {
	return "StoreDto [storeId=" + storeId + ", storeName=" + storeName + ", country=" + country + ", city=" + city
			+ ", storeEmail=" + storeEmail + ", phoneNumber=" + phoneNumber + ", imageUrl=" + imageUrl
			+ ", description=" + description + ", user=" + user + "]";
}

}
