package com.local.spring.application.communities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long memberID;
	private long name;
	private long status;
	public long getMemberID() {
		return memberID;
	}
	public void setMemberID(long memberID) {
		this.memberID = memberID;
	}
	public long getName() {
		return name;
	}
	public void setName(long name) {
		this.name = name;
	}
	public long getStatus() {
		return status;
	}
	public void setStatus(long status) {
		this.status = status;
	}
	
}
