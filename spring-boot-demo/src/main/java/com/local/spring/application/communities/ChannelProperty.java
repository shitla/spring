package com.local.spring.application.communities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChannelProperty implements Serializable {
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long channelPropertyID;
	private long channelID;
	private String value;
	
	public long getChannelPropertyID() {
		return channelPropertyID;
	}
	public void setChannelPropertyID(long channelPropertyID) {
		this.channelPropertyID = channelPropertyID;
	}
	public long getChannelID() {
		return channelID;
	}
	public void setChannelID(long channelID) {
		this.channelID = channelID;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
