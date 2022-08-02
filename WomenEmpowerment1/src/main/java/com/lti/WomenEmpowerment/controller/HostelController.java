package com.lti.WomenEmpowerment.controller;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.lti.WomenEmpowerment.model.Application;
import com.lti.WomenEmpowerment.model.Documents;
import com.lti.WomenEmpowerment.model.FamilyDetails;
import com.lti.WomenEmpowerment.model.hostel1;

import com.lti.WomenEmpowerment.repo.hostelRepo;
import com.lti.WomenEmpowerment.service.DocumentsService;

import java.io.IOException;
import java.util.*;

@RestController
@CrossOrigin
public class HostelController {

	
	@Autowired
	private hostelRepo hostelRepository;
	@Autowired
	DocumentsService documentsService;
	@PostMapping("/hostel")
	public hostel1 createhostel1(@Valid @RequestParam("hName") String hName,
										@RequestParam("hLocation") String hLocation,
										@RequestParam("hRanBy") String hRanBy,
										@RequestParam("traineeFirstname") String traineeFirstname,
										@RequestParam("traineeMiddlename") String traineeMiddlename,
										@RequestParam("traineeLastname") String traineeLastname,
										@RequestParam("traineeState") String traineeState,
										@RequestParam("traineeCity") String traineeCity,
										@RequestParam("traineeAddress") String traineeAddress,
										@RequestParam("traineePan") String traineePan,
										@RequestParam("traineeEducationDetails") String traineeEducationDetails,
										@RequestParam("traineeAadhaar") Long traineeAadhaar,
										@RequestParam("files") MultipartFile file,
										@RequestParam("gFirstName") String gFName,
										@RequestParam("gMiddleName") String gMName,
										@RequestParam("gLastName") String gLName,
										@RequestParam("gEducationDetails") String gEducationDetails,
										@RequestParam("gRelation") String gRelation,
										@RequestParam("username") String username,
										@RequestParam("status") String status,
										@RequestParam("gMobile") Long gMobile,
										@RequestParam("gEmail") String gEmail) throws IOException {
		hostel1 h = new hostel1();
		h.sethName(hName);
		h.sethLocation(hLocation);
		h.sethRanBy(hRanBy);
		
		FamilyDetails f = new FamilyDetails();
		f.setGuardianFirstname(gFName);
		f.setGuardianMiddlename(gMName);
		f.setGuardianLastname(gLName);
		f.setGuardianEducationDetails(gEducationDetails);
		f.setGuardianRealtion(gRelation);
		f.setGuardianMobile(gMobile);
		f.setGuardianemail(gEmail);
		
		Documents d =  new Documents();
		String docname = file.getOriginalFilename();
		String doctype = file.getContentType();
		byte[] b = file.getBytes();
		System.out.println(b);
		d.setFileName(docname);
		d.setFileType(doctype);
		d.setData(b);
		
		Application a = new Application();
		a.setTraineeFirstname(traineeFirstname);
		a.setTraineeMiddlename(traineeMiddlename);
		a.setTraineeLastname(traineeLastname);
		a.setTraineeCity(traineeCity);
		a.setTraineeAddress(traineeAddress);
		a.setTraineeState(traineeState);
		a.setTraineeAadhaar(traineeAadhaar);
		a.setTraineeEducationDetails(traineeEducationDetails);
		a.setTraineePan(traineePan);
		a.setUsername(username);
		a.setStatus(status);
		a.setApplicationtype("hostel");
		a.setF(f);
		a.setD(d);
		
		h.setA(a);
		documentsService.saveFile(file);
		
		return hostelRepository.save(h);
	}
	@GetMapping("/hostels")
	public List<hostel1> fetchAll()
	{
		List<hostel1> ls = hostelRepository.findAll();
		return ls;
	}
}
