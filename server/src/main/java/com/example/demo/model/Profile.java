package com.example.demo.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="profile")
public class Profile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long profileId;
	private String name;
	private String mobile;
	private String gender;
	private String email;
	private String url;
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "profile")
	private Set<Education> education = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "profile")
	private Set<Intership> interships = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "profile")
	private Set<Project> projects = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "profile")
	private Set<KeyInterest> keyInterests = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "profile")
	private Set<KeySkill> keySkills = new HashSet<>();
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "profile")
	private Set<TechSkill> techSkills = new HashSet<>();
	
	
	
	
	public Set<Education> getEducation() {
		return education;
	}
	public void setEducation(Set<Education> education) {
		this.education = education;
	}
	public Set<Intership> getInterships() {
		return interships;
	}
	public void setInterships(Set<Intership> interships) {
		this.interships = interships;
	}
	public Set<Project> getProjects() {
		return projects;
	}
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}
	public Set<KeyInterest> getKeyInterests() {
		return keyInterests;
	}
	public void setKeyInterests(Set<KeyInterest> keyInterests) {
		this.keyInterests = keyInterests;
	}
	public Set<KeySkill> getKeySkills() {
		return keySkills;
	}
	public void setKeySkills(Set<KeySkill> keySkills) {
		this.keySkills = keySkills;
	}
	public Set<TechSkill> getTechSkills() {
		return techSkills;
	}
	public void setTechSkills(Set<TechSkill> techSkills) {
		this.techSkills = techSkills;
	}
	
	
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profile(Long profileId, String name, String mobile, String gender, String email, String url) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.mobile = mobile;
		this.gender = gender;
		this.email = email;
		this.url = url;
	}
	public Long getProfileId() {
		return profileId;
	}
	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	

}
