package com.local.spring.application.communities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Portal implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long portalID;
	
	private long communityID;
	
	private String name;
	
	private int restriction;
	
	/*@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="portalID")
	private List<Channel> channels;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="portalID")
	private Set<PortalProperty> properties;*/

	public long getPortalID() {
		return portalID;
	}

	public void setPortalID(long portalID) {
		this.portalID = portalID;
	}

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

	/*public List<Channel> getChannels() {
		return channels;
	}

	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}

	public Set<PortalProperty> getProperties() {
		return properties;
	}

	public void setProperties(Set<PortalProperty> properties) {
		this.properties = properties;
	}*/

	
}
