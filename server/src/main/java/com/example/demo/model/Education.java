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
@Table(name="education")
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long educationId;
	private String degree;
	private String school;
	private String year;
	private String place;
	private String score;
	
	
	 @ManyToOne(fetch = FetchType.EAGER)
	 private Profile profile;
	 
	 

	public Education() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Education(Long educationId, String degree, String school, String year, String place, String score,
			Profile profile) {
		super();
		this.educationId = educationId;
		this.degree = degree;
		this.school = school;
		this.year = year;
		this.place = place;
		this.score = score;
		this.profile = profile;
	}



	public Long getEducationId() {
		return educationId;
	}



	public void setEducationId(Long educationId) {
		this.educationId = educationId;
	}



	public String getDegree() {
		return degree;
	}



	public void setDegree(String degree) {
		this.degree = degree;
	}



	public String getSchool() {
		return school;
	}



	public void setSchool(String school) {
		this.school = school;
	}



	public String getYear() {
		return year;
	}



	public void setYear(String year) {
		this.year = year;
	}



	public String getPlace() {
		return place;
	}



	public void setPlace(String place) {
		this.place = place;
	}



	public String getScore() {
		return score;
	}



	public void setScore(String score) {
		this.score = score;
	}



	public Profile getProfile() {
		return profile;
	}



	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	

	
	

}
