package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Profile;
import com.example.demo.repo.ProfileRepo;


@Service
public class ProfileServiceImpl implements ProfileService{
	
	
	@Autowired
	private ProfileRepo profileRepo;
	
	public ProfileServiceImpl() {
		
	}

	@Override
	public List<Profile> getProfiles() {
		// TODO Auto-generated method stub
		return profileRepo.findAll();
	}

	@Override
	public Profile getProfile(long profileId) {
		// TODO Auto-generated method stub
		return profileRepo.getOne(profileId);
	}

	@Override
	public Profile addProfile(Profile profile) {
		// TODO Auto-generated method stub
		
		profileRepo.save(profile);
		return profile;
	}

	@Override
	public Profile updateProfile(Profile profile) {
		// TODO Auto-generated method stub
		
		profileRepo.save(profile);
		return profile;
	}

	@Override
	public void deleteProfile(long parseLong) {
		// TODO Auto-generated method stub
		
		Profile entityProfile  = profileRepo.getOne(parseLong);
		profileRepo.delete(entityProfile);
		
	}
	
	
	
	

}
