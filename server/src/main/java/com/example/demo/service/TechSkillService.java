package com.example.demo.service;

import java.util.List;

import com.example.demo.model.TechSkill;

public interface TechSkillService {

	public List<TechSkill> getTechSkills();
	
	public TechSkill getTechSkill(long techskillId);
	
	public TechSkill addTechSkill(TechSkill techSkill);
	
	public TechSkill updateTechSkill(TechSkill techSkill);
	
	public void deleteTechSkill(long parseLong);
}
