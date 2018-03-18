package com.local.spring.application.communities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Item implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long itemID;
	
	private long channelID;
	
	private String name;
	
	private int restriction;
	
	private String content;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="itemID")
	private List<ItemProperty> properties;

	public long getItemID() {
		return itemID;
	}

	public void setItemID(long itemID) {
		this.itemID = itemID;
	}

	public long getChannelID() {
		return channelID;
	}

	public void setChannelID(long channelID) {
		this.channelID = channelID;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<ItemProperty> getProperties() {
		return properties;
	}

	public void setProperties(List<ItemProperty> properties) {
		this.properties = properties;
	}
	
}
