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
public class Channel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long channelID;

	private long portalID;

	private String name;

	private int restriction;

	/*@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "portalID")
	private Set<Item> items;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "portalID")
	private Set<ChannelProperty> properties;*/

	public long getChannelID() {
		return channelID;
	}

	public void setChannelID(long channelID) {
		this.channelID = channelID;
	}

	public long getPortalID() {
		return portalID;
	}

	public void setPortalID(long portalID) {
		this.portalID = portalID;
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
/*
	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public Set<ChannelProperty> getProperties() {
		return properties;
	}

	public void setProperties(Set<ChannelProperty> properties) {
		this.properties = properties;
	}*/

}
