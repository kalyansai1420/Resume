package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.KeyInterest;
import com.example.demo.repo.KeyInterestRepo;

@Service
public class KeyInterestServiceImpl implements KeyInterestService{
	
	
	@Autowired
	private KeyInterestRepo keyInterestRepo;

	@Override
	public List<KeyInterest> getKeyInterests() {
		// TODO Auto-generated method stub
		return keyInterestRepo.findAll();
	}

	@Override
	public KeyInterest getKeyInterest(long keyinterestId) {
		// TODO Auto-generated method stub
		return keyInterestRepo.getOne(keyinterestId);
	}

	@Override
	public KeyInterest addKeyInterest(KeyInterest keyInterest) {
		// TODO Auto-generated method stub
		keyInterestRepo.save(keyInterest);
		return keyInterest;
	}

	@Override
	public KeyInterest updatKeyInterest(KeyInterest keyInterest) {
		// TODO Auto-generated method stub
		
		keyInterestRepo.save(keyInterest);
		return keyInterest;
	}

	@Override
	public void deleteKeyInterest(long parseLong) {
		// TODO Auto-generated method stub
		
		KeyInterest entityKeyInterest = keyInterestRepo.getOne(parseLong);
		keyInterestRepo.delete(entityKeyInterest);
		
	}
	
	
}