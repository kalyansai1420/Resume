package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Intership;
import com.example.demo.repo.IntershipRepo;

@Service
public class IntershipServiceImpl implements IntershipService {
	
	
	@Autowired
	private IntershipRepo intershipRepo;
	
	private IntershipServiceImpl() {
		
	}

	@Override
	public List<Intership> getInterships() {
		// TODO Auto-generated method stub
		return intershipRepo.findAll();
	}

	@Override
	public Intership getIntership(long intershipId) {
		// TODO Auto-generated method stub
		return intershipRepo.getOne(intershipId);
	}

	@Override
	public Intership addIntership(Intership intership) {
		// TODO Auto-generated method stub
		intershipRepo.save(intership);
		return intership;
	}

	@Override
	public Intership updaIntership(Intership intership) {
		// TODO Auto-generated method stub
		intershipRepo.save(intership);
		return intership;
	}

	@Override
	public void deleteIntership(Long parseLong) {
		// TODO Auto-generated method stub
		
		Intership entityIntership = intershipRepo.getOne(parseLong);
		intershipRepo.delete(entityIntership);
		
	}
	
	

}
