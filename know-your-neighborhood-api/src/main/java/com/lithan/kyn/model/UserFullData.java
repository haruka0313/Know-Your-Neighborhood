package com.lithan.kyn.model;

import java.util.List;

import com.lithan.kyn.entity.Store;


import lombok.Data;


@Data
public class UserFullData {

  private UserDto profile;

  private List<Store> stores;

  private List<String> roles;


public UserFullData() {

}


public UserFullData(UserDto profile, List<Store> stores, List<String> roles) {
	super();
	this.profile = profile;
	this.stores = stores;
	this.roles = roles;
}


public UserDto getProfile() {
	return profile;
}


public void setProfile(UserDto profile) {
	this.profile = profile;
}


public List<Store> getStores() {
	return stores;
}


public void setStores(List<Store> stores) {
	this.stores = stores;
}


public List<String> getRoles() {
	return roles;
}


public void setRoles(List<String> roles) {
	this.roles = roles;
}


@Override
public String toString() {
	return "UserFullData [profile=" + profile + ", stores=" + stores + ", roles=" + roles + "]";
}
  
  

}
