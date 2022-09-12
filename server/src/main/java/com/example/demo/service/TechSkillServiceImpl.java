package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.TechSkill;
import com.example.demo.repo.TechSkillRepo;

@Service
public class TechSkillServiceImpl implements TechSkillService{
	
	@Autowired
	private TechSkillRepo techSkillRepo;

	private TechSkillServiceImpl() {
		
	}
	
	@Override
	public List<TechSkill> getTechSkills() {
		// TODO Auto-generated method stub
		return techSkillRepo.findAll();
	}

	@Override
	public TechSkill getTechSkill(long techskillId) {
		// TODO Auto-generated method stub
		
		return techSkillRepo.getOne(techskillId);
	}

	@Override
	public TechSkill addTechSkill(TechSkill techSkill) {
		// TODO Auto-generated method stub
		techSkillRepo.save(techSkill);
		return techSkill;
	}

	@Override
	public TechSkill updateTechSkill(TechSkill techSkill) {
		// TODO Auto-generated method stub
		techSkillRepo.save(techSkill);
		return techSkill;
	}

	@Override
	public void deleteTechSkill(long parseLong) {
		// TODO Auto-generated method stub
		
		TechSkill entiTechSkill = techSkillRepo.getOne(parseLong);
		techSkillRepo.delete(entiTechSkill);
		
	}
	
	

}
