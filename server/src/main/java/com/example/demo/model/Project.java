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
@Table(name = "projects")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long projectId;
	private String title;
	private String technology;
	private String projectInfo;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	 private Profile profile;
	 
	 
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Project(Long projectId, String title, String technology, String projectInfo, Profile profile) {
		super();
		this.projectId = projectId;
		this.title = title;
		this.technology = technology;
		this.projectInfo = projectInfo;
		this.profile = profile;
	}


	public Long getProjectId() {
		return projectId;
	}


	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getTechnology() {
		return technology;
	}


	public void setTechnology(String technology) {
		this.technology = technology;
	}


	public String getProjectInfo() {
		return projectInfo;
	}


	public void setProjectInfo(String projectInfo) {
		this.projectInfo = projectInfo;
	}


	public Profile getProfile() {
		return profile;
	}


	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	

}
