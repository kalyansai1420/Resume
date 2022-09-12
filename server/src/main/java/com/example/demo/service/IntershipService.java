package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Intership;

public interface IntershipService {
	
	
	public List<Intership> getInterships();
	
	public Intership getIntership(long intershipId);
	
	public Intership addIntership(Intership intership);
	
	public Intership updaIntership(Intership intership);
	
	public void deleteIntership(Long parseLong);

}
