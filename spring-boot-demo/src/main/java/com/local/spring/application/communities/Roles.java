package com.local.spring.application.communities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Roles implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long roleID;
	private String name;
	public long getRoleID() {
		return roleID;
	}
	public void setRoleID(long roleID) {
		this.roleID = roleID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
