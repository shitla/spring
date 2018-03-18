package com.local.spring.application.communities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity	
public class CommunityProperty  implements Serializable{
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long communityPropertyID;
	private long communityID;
	private String value;
	public long getCommunityPropertyID() {
		return communityPropertyID;
	}
	public void setCommunityPropertyID(long communityPropertyID) {
		this.communityPropertyID = communityPropertyID;
	}
	public long getCommunityID() {
		return communityID;
	}
	public void setCommunityID(long communityID) {
		this.communityID = communityID;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
