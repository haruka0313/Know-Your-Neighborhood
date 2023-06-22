package com.lithan.kyn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.NaturalId;


@Entity
@Table(name = "tb_roles", uniqueConstraints = { @UniqueConstraint(columnNames = "role_name") })
public class Roles {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "role_id")
  private int roleId;

  @Enumerated(EnumType.STRING)
  @NaturalId
  @Column(name = "role_name")
  private ERole name;

  public Roles(ERole name) {
    this.name = name;
  }


public Roles() {
	
}


public Roles(int roleId, ERole name) {
	super();
	this.roleId = roleId;
	this.name = name;
}


public int getRoleId() {
	return roleId;
}


public void setRoleId(int roleId) {
	this.roleId = roleId;
}


public ERole getName() {
	return name;
}


public void setName(ERole name) {
	this.name = name;
}


@Override
public String toString() {
	return "Roles [roleId=" + roleId + ", name=" + name + "]";
}
  
  

}
