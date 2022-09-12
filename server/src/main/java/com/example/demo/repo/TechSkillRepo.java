package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.TechSkill;

public interface TechSkillRepo extends JpaRepository<TechSkill,Long> {

}
