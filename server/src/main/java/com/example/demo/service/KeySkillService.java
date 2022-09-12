package com.example.demo.service;

import java.util.List;

import com.example.demo.model.KeySkill;

public interface KeySkillService {
	
	public List<KeySkill> getKeySkills();
	
	public KeySkill getKeySkill(long keyskillId);
	
	public KeySkill addKeySkill(KeySkill keySkill);
	
	public KeySkill updaKeySkill(KeySkill keySkill);
	
	public void deleteKeySkill(long parseLong);

}
