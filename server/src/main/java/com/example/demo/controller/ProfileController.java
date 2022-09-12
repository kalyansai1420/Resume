package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Education;
import com.example.demo.model.Intership;
import com.example.demo.model.KeyInterest;
import com.example.demo.model.KeySkill;
import com.example.demo.model.Profile;
import com.example.demo.model.Project;
import com.example.demo.model.TechSkill;
import com.example.demo.service.EducationService;
import com.example.demo.service.IntershipService;
import com.example.demo.service.KeyInterestService;
import com.example.demo.service.KeySkillService;
import com.example.demo.service.ProfileService;
import com.example.demo.service.ProjectService;
import com.example.demo.service.TechSkillService;

@RestController
@CrossOrigin("*")
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;
	
	@Autowired
	private EducationService educationService;
	
	@Autowired
	private KeyInterestService keyInterestService;
	
	@Autowired
	private KeySkillService keySkillService;
	
	@Autowired
	private TechSkillService techSkillService;
	
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private IntershipService intershipService;
	
	//Profile
	@GetMapping("/")
	public List<Profile> getProfiles()
	{
		return this.profileService.getProfiles();
	}
	@PostMapping("/")
	public Profile addProfile(@RequestBody Profile profile)
	{
		return this.profileService.addProfile(profile);
	}
	
	//Education
	@GetMapping("/education")
	public List<Education> getEducations()
	{ 
		return this.educationService.getEducations();
	}
	
	@PostMapping("/education")
	public Education addEducation(@RequestBody Education education)
	{
		return this.educationService.addEducation(education);
	}
	
	//Intership
	@GetMapping("/intership")
	public List<Intership> getInterships()
	{ 
		return this.intershipService.getInterships();
	}
	
	@PostMapping("/intership")
	public Intership addIntership(@RequestBody Intership intership)
	{
		return this.intershipService.addIntership(intership);
	}
	
	// Key Interest
	@GetMapping("/keyinterest")
	public List<KeyInterest> getInterests()
	{ 
		return this.keyInterestService.getKeyInterests();
	}
	
	@PostMapping("/keyinterest")
	public KeyInterest addKeyInterest(@RequestBody KeyInterest keyInterest)
	{
		return this.keyInterestService.addKeyInterest(keyInterest);
	}	

	// Key Skill
	@GetMapping("/keyskill")
	public List<KeySkill> getKeySkills()
	{
		return this.keySkillService.getKeySkills();
	}
	
	@PostMapping("/keyskill")
	public KeySkill addKeySkill(@RequestBody KeySkill keySkill)
	{
		return this.keySkillService.addKeySkill(keySkill);
	}
	
	// Project
	
	@GetMapping("/project")
	public List<Project> getProjects()
	{
		return this.projectService.getProjects();
	}
	
	@PostMapping("/project")
	public Project addProject(@RequestBody Project project)
	{
		return this.projectService.addProject(project);
	}
	
	//Tech Skill
	
	@GetMapping("/techskill")
	public List<TechSkill> geTechSkills()
	{
		return this.techSkillService.getTechSkills();
	}
	
	@PostMapping("/techskill")
	public TechSkill addTechSkill(@RequestBody TechSkill techSkill)
	{
		return this.techSkillService.addTechSkill(techSkill);
	}
	
	
	
}
