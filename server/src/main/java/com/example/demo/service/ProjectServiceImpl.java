package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Project;
import com.example.demo.repo.ProjectRepo;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectRepo projectRepo;
	
	private ProjectServiceImpl() {
		// TODO Auto-generated constructor stub
			
	}

	@Override
	public List<Project> getProjects() {
		// TODO Auto-generated method stub
		return projectRepo.findAll();
	}

	@Override
	public Project getProject(long projectId) {
		// TODO Auto-generated method stub
		
		return projectRepo.getOne(projectId);
	}

	@Override
	public Project addProject(Project project) {
		// TODO Auto-generated method stub
		projectRepo.save(project);
		return project;
	}

	@Override
	public Project updateProject(Project project) {
		// TODO Auto-generated method stub
		
		projectRepo.save(project);
		return project;
	}

	@Override
	public void deleteProject(long parseLong) {
		// TODO Auto-generated method stub
		
	}
	
	

}
