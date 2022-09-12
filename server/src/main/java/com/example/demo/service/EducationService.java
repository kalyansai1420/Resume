package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Education;

public interface EducationService {

	public List<Education> getEducations();
	
	public Education getEducation(long educationId);
	
	public Education addEducation(Education education);
	
	public Education updatEducation(Education education);
	
	public void deleteEducation(long parseLong);
}
