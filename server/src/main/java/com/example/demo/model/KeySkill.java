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
@Table(name = "keyskills")
public class KeySkill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long keyskillId;
	private String keyskill;
	
	@ManyToOne(fetch = FetchType.EAGER)
	 private Profile profile;
	 
	 
	
	public KeySkill() {
		super();
		// TODO Auto-generated constructor stub
	}



	public KeySkill(Long keyskillId, String keyskill, Profile profile) {
		super();
		this.keyskillId = keyskillId;
		this.keyskill = keyskill;
		this.profile = profile;
	}



	public Long getKeyskillId() {
		return keyskillId;
	}



	public void setKeyskillId(Long keyskillId) {
		this.keyskillId = keyskillId;
	}



	public String getKeyskill() {
		return keyskill;
	}



	public void setKeyskill(String keyskill) {
		this.keyskill = keyskill;
	}



	public Profile getProfile() {
		return profile;
	}



	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	
}
