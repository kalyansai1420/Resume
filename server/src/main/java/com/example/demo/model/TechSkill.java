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
@Table(name="techskills")
public class TechSkill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long techskillId;
	private String techskill;
	
	@ManyToOne(fetch = FetchType.EAGER)
	 private Profile profile;
	 
	 
	
	
	public TechSkill() {
		super();
		// TODO Auto-generated constructor stub
	}




	public TechSkill(Long techskillId, String techskill, Profile profile) {
		super();
		this.techskillId = techskillId;
		this.techskill = techskill;
		this.profile = profile;
	}




	public Long getTechskillId() {
		return techskillId;
	}




	public void setTechskillId(Long techskillId) {
		this.techskillId = techskillId;
	}




	public String getTechskill() {
		return techskill;
	}




	public void setTechskill(String techskill) {
		this.techskill = techskill;
	}




	public Profile getProfile() {
		return profile;
	}




	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	
	
	
}
