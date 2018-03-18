package com.local.spring.application.communities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemProperty implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long itemPropertyID;
	private long itemID;
	private String value;
	public long getItemPropertyID() {
		return itemPropertyID;
	}
	public void setItemPropertyID(long itemPropertyID) {
		this.itemPropertyID = itemPropertyID;
	}
	public long getItemID() {
		return itemID;
	}
	public void setItemID(long itemID) {
		this.itemID = itemID;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
