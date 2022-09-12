package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Profile;

public interface ProfileService {
	
	public List<Profile> getProfiles();
	
	public Profile getProfile(long profileId);
	
	public Profile addProfile(Profile profile);
	
	public Profile updateProfile(Profile profile);
	
	public void deleteProfile(long parseLong);
	
	
	

	
	
}
