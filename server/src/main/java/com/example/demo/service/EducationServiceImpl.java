package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Education;
import com.example.demo.repo.EducationRepo;

@Service
public class EducationServiceImpl implements EducationService{
	
	@Autowired
	private EducationRepo educationRepo;
	
	
	private EducationServiceImpl() {
		
	}


	@Override
	public List<Education> getEducations() {
		// TODO Auto-generated method stub
		
		return educationRepo.findAll();
	}


	@Override
	public Education getEducation(long educationId) {
		// TODO Auto-generated method stub
		return educationRepo.getOne(educationId);
	}


	@Override
	public Education addEducation(Education education) {
		// TODO Auto-generated method stub
		educationRepo.save(education);
		return education;
	}


	@Override
	public Education updatEducation(Education education) {
		// TODO Auto-generated method stub
		
		educationRepo.save(education);
		return education;
	}


	@Override
	public void deleteEducation(long parseLong) {
		Education entityEducation = educationRepo.getOne(parseLong);
		educationRepo.delete(entityEducation);
		
	}
	

}
