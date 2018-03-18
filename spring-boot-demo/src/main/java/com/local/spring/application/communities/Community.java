package com.local.spring.application.communities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Community implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long communityID;

	private String name;

	private int restriction;

	/*@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "communityID")
	private Set<Portal> portals;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "communityID")
	private Set<CommunityProperty> properties;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "communityID")
	private Set<CommunityMember> members;*/

	public long getCommunityID() {
		return communityID;
	}

	public void setCommunityID(long communityID) {
		this.communityID = communityID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRestriction() {
		return restriction;
	}

	public void setRestriction(int restriction) {
		this.restriction = restriction;
	}

	/*public Set<Portal> getPortals() {
		return portals;
	}

	public void setPortals(Set<Portal> portals) {
		this.portals = portals;
	}

	public Set<CommunityProperty> getProperties() {
		return properties;
	}

	public void setProperties(Set<CommunityProperty> properties) {
		this.properties = properties;
	}

	public Set<CommunityMember> getMembers() {
		return members;
	}

	public void setMembers(Set<CommunityMember> members) {
		this.members = members;
	}*/

}
