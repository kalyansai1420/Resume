package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Project;

public interface ProjectService {
	
	public List<Project> getProjects();

	public Project getProject(long projectId);
	
	public Project addProject(Project project);
	
	public Project updateProject(Project project);
	
	public void deleteProject(long parseLong);

}
