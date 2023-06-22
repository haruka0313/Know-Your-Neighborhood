package com.lithan.kyn.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.lithan.kyn.model.StoreDto;

@Entity
@Table(name = "tb_store")
public class Store {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "store_id")
  private int storeId;

  @Column(nullable = false)
  private String storeName;

  @Column(nullable = false)
  private String country;

  @Column(nullable = false)
  private String city;

  @Column(nullable = false)
  private String storeEmail;

  @Column(nullable = false)
  private String phoneNumber;

  private String description;

  @Lob
  private String imageUrl;

  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name = "user_id")
  private UserAccount user;

  public Store(StoreDto storeDto, UserAccount user) {
    this.storeName = storeDto.getStoreName();
    this.country = storeDto.getCountry();
    this.city = storeDto.getCity();
    this.storeEmail = storeDto.getStoreEmail();
    this.phoneNumber = storeDto.getPhoneNumber();
    this.description = storeDto.getDescription();
    this.imageUrl = storeDto.getImageUrl();
    this.user = user;
  }

/**
 * 
 */
public Store() {
	
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

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getImageUrl() {
	return imageUrl;
}

public void setImageUrl(String imageUrl) {
	this.imageUrl = imageUrl;
}

public UserAccount getUser() {
	return user;
}

public void setUser(UserAccount user) {
	this.user = user;
}

public Store(int storeId, String storeName, String country, String city, String storeEmail, String phoneNumber,
		String description, String imageUrl, UserAccount user) {
	super();
	this.storeId = storeId;
	this.storeName = storeName;
	this.country = country;
	this.city = city;
	this.storeEmail = storeEmail;
	this.phoneNumber = phoneNumber;
	this.description = description;
	this.imageUrl = imageUrl;
	this.user = user;
}

@Override
public String toString() {
	return "Store [storeId=" + storeId + ", storeName=" + storeName + ", country=" + country + ", city=" + city
			+ ", storeEmail=" + storeEmail + ", phoneNumber=" + phoneNumber + ", description=" + description
			+ ", imageUrl=" + imageUrl + ", user=" + user + "]";
}
  
  

}
