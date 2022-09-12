package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="keyinterests")
public class KeyInterest {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long keyinterestId;
	private String keyinterest;
	
	@ManyToOne(fetch = FetchType.EAGER)
	 private Profile profile;
	 
	 
	
	public KeyInterest() {
		super();
		// TODO Auto-generated constructor stub
	}



	public KeyInterest(Long keyinterestId, String keyinterest, Profile profile) {
		super();
		this.keyinterestId = keyinterestId;
		this.keyinterest = keyinterest;
		this.profile = profile;
	}



	public Long getKeyinterestId() {
		return keyinterestId;
	}



	public void setKeyinterestId(Long keyinterestId) {
		this.keyinterestId = keyinterestId;
	}



	public String getKeyinterest() {
		return keyinterest;
	}



	public void setKeyinterest(String keyinterest) {
		this.keyinterest = keyinterest;
	}



	public Profile getProfile() {
		return profile;
	}



	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	
	

}
