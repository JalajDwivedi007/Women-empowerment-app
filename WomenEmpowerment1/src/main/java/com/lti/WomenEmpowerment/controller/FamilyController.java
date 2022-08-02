package com.lti.WomenEmpowerment.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import com.lti.WomenEmpowerment.model.FamilyDetails;

import com.lti.WomenEmpowerment.repo.FamilyDetailsRepo;

import java.util.*;



@RestController 
public class FamilyController {
    
	@Autowired
	private FamilyDetailsRepo familyRepository;
	
	@PostMapping("/family")
	public FamilyDetails createFamilyDetails(@Valid @RequestBody FamilyDetails app) {
		return familyRepository.save(app);
	}
	@GetMapping("/families")
	public List<FamilyDetails> fetchAll()
	{
		List<FamilyDetails> ls = familyRepository.findAll();
		return ls;
	}
	
}