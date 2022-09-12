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
@Table(name = "interships")
public class Intership {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long intershipId;
	private String company;
	private String year;
	private String role;
	private String work;
	
	@ManyToOne(fetch = FetchType.EAGER)
	 private Profile profile;
	 
	
	
	public Intership() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Intership(Long intershipId, String company, String year, String role, String work, Profile profile) {
		super();
		this.intershipId = intershipId;
		this.company = company;
		this.year = year;
		this.role = role;
		this.work = work;
		this.profile = profile;
	}



	public Long getIntershipId() {
		return intershipId;
	}



	public void setIntershipId(Long intershipId) {
		this.intershipId = intershipId;
	}



	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public String getYear() {
		return year;
	}



	public void setYear(String year) {
		this.year = year;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public String getWork() {
		return work;
	}



	public void setWork(String work) {
		this.work = work;
	}



	public Profile getProfile() {
		return profile;
	}



	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	
	
	
	
	

}
