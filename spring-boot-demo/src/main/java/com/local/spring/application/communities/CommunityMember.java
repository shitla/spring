package com.local.spring.application.communities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CommunityMember implements Serializable {
	@Id
	private long communityMemberID;
	
	private long memberID;
	
	private long communityID;
	
	private long roleID;
	
	public long getCommunityMemberID() {
		return communityMemberID;
	}
	public void setCommunityMemberID(long communityMemberID) {
		this.communityMemberID = communityMemberID;
	}
	public long getMemberID() {
		return memberID;
	}
	public void setMemberID(long memberID) {
		this.memberID = memberID;
	}
	public long getCommunityID() {
		return communityID;
	}
	public void setCommunityID(long communityID) {
		this.communityID = communityID;
	}
	public long getRoleID() {
		return roleID;
	}
	public void setRoleID(long roleID) {
		this.roleID = roleID;
	}
	
}
