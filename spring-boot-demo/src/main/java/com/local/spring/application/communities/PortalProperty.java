package com.local.spring.application.communities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PortalProperty implements Serializable {

	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long portalPropertyID;
	
	private long portalID;
	
	private String value;

	public long getPortalPropertyID() {
		return portalPropertyID;
	}

	public void setPortalPropertyID(long portalPropertyID) {
		this.portalPropertyID = portalPropertyID;
	}

	public long getPortalID() {
		return portalID;
	}

	public void setPortalID(long portalID) {
		this.portalID = portalID;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
