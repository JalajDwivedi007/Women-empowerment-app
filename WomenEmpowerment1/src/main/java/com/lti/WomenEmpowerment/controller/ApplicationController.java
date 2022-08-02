package com.lti.WomenEmpowerment.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.lti.WomenEmpowerment.model.Application;
import com.lti.WomenEmpowerment.repo.ApplicationRepo;
import com.lti.WomenEmpowerment.service.DocumentsService;

import java.util.*;


@CrossOrigin
@RestController 
public class ApplicationController {
    
	@Autowired
	private ApplicationRepo applicationRepository;
//	@Autowired
//	DocumentsService documentsService;
	
	@PostMapping("/application")
	public Application createApplication(@Valid @RequestBody Application app) {
//		documentsService.saveFile(file);
		return applicationRepository.save(app);
	}
	@GetMapping("/applications")
	public List<Application> fetchAll()
	{
		List<Application> ls = applicationRepository.findAll();
		return ls;
	}
	@PutMapping("/changeApplicationStatus/{id}")
	public Application changeStatus(@Valid @PathVariable("id") Long id,@RequestParam("status") String status) {
		Optional<Application> a = applicationRepository.findById(id);
		Application ap = a.get();
		ap.setStatus(status);
		return applicationRepository.save(ap);
	}
	
}