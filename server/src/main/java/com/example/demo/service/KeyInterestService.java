package com.example.demo.service;

import java.util.List;

import com.example.demo.model.KeyInterest;

public interface KeyInterestService {
	
	public List<KeyInterest> getKeyInterests();
	
	public KeyInterest getKeyInterest(long keyinterestId);
	
	public KeyInterest addKeyInterest(KeyInterest keyInterest);
	
	public KeyInterest updatKeyInterest(KeyInterest keyInterest);
	
	public void deleteKeyInterest(long parseLong);

	
}
