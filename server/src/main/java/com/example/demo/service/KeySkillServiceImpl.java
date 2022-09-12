package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.KeySkill;
import com.example.demo.repo.KeySkillRepo;

@Service
public class KeySkillServiceImpl implements KeySkillService{

	@Autowired
	private KeySkillRepo keySkillRepo;

	private KeySkillServiceImpl() {
		
	}
	
	@Override
	public List<KeySkill> getKeySkills() {
		// TODO Auto-generated method stub
		return keySkillRepo.findAll();
	}

	@Override
	public KeySkill getKeySkill(long keyskillId) {
		// TODO Auto-generated method stub
		
		return keySkillRepo.getOne(keyskillId);
	}

	@Override
	public KeySkill addKeySkill(KeySkill keySkill) {
		// TODO Auto-generated method stub
		keySkillRepo.save(keySkill);
		return keySkill;
	}

	@Override
	public KeySkill updaKeySkill(KeySkill keySkill) {
		// TODO Auto-generated method stub
		keySkillRepo.save(keySkill);
		return keySkill;
	}

	@Override
	public void deleteKeySkill(long parseLong) {
		// TODO Auto-generated method stub
		KeySkill entityKeySkill = keySkillRepo.getOne(parseLong);
		keySkillRepo.delete(entityKeySkill);
		
	}
	
	
}
