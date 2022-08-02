package com.lti.WomenEmpowerment.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lti.WomenEmpowerment.model.Application;
import com.lti.WomenEmpowerment.model.Documents;
import com.lti.WomenEmpowerment.model.ngo;
import com.lti.WomenEmpowerment.repo.ngoRepo;
import com.lti.WomenEmpowerment.service.DocumentsService;
@CrossOrigin
@RestController
public class NgoController {

	
	@Autowired
	private ngoRepo ngoRepository;
	@Autowired
	DocumentsService documentsService;
	
	@PostMapping("/ngo")
	public ngo createngo(@Valid  @RequestParam("ngoName") String ngoName,
								 @RequestParam("members") int members,
								 @RequestParam("workAreas") String workAreas ,
								 @RequestParam("ngoState") String ngoState,
								 @RequestParam("ngocity") String ngocity,
								 @RequestParam("ngoAddress") String ngoAddress,
								 @RequestParam("ngoRegistrationNumber") long ngoRegistrationNumber,
								 @RequestParam("ngoDOE") String ngoDOE,
								 @RequestParam("newCampaign") String newCampaign,
								 @RequestParam("ngoProjDetails") String ngoProjDetails,
								 @RequestParam("ngoAmount") int ngoAmount,
								 @RequestParam("ngoMobile") long ngoMobile,
								 @RequestParam("ngoEmail") String ngoEmail,
								 @RequestParam("ngoWebsite") String ngoWebsite,
								 @RequestParam("fname") String fname,
								 @RequestParam("mname") String mname,
								 @RequestParam("lname") String lname,
								 @RequestParam("inchargeAddress") String inchargeAddress,
								 @RequestParam("inchargeEdu") String inchargeEdu,
								 @RequestParam("username") String username,
								 @RequestParam("status") String status,
								 @RequestParam("inchargeAadhaar") long inchargeAadhaar,
								 @RequestParam("files") MultipartFile file) throws IOException{
		
		ngo ng = new ngo();
		ng.setNgoName(ngoName);
		ng.setMembers(members);
		ng.setWorkAreas(workAreas);
		ng.setNgoState(ngoState);
		ng.setNgocity(ngocity);
		ng.setNgoAddress(ngoAddress);
		ng.setNgoRegisterationNo(inchargeAadhaar);
		ng.setNgoDOE(ngoDOE);
		ng.setNewCampaign(newCampaign);
		ng.setNgoProjDetails(ngoProjDetails);
		ng.setNgoAmount(ngoAmount);
		ng.setNgoMobile(ngoMobile);
		ng.setNgoEmail(ngoEmail);
		ng.setNgoWebsite(ngoWebsite);
		ng.setFname(fname);
		ng.setMname(mname);
		ng.setLname(lname);
		ng.setInchargeAddress(inchargeAddress);
		ng.setInchargeEdu(inchargeEdu);
		ng.setInchargeAadhar(inchargeAadhaar);
		ng.setUsername(username);
		ng.setStatus(status);
		

		Documents d =  new Documents();
		String docname = file.getOriginalFilename();
		String doctype = file.getContentType();
		byte[] b = file.getBytes();
		System.out.println(b);
		d.setFileName(docname);
		d.setFileType(doctype);
		d.setData(b);
		
		ng.setD(d);
		documentsService.saveFile(file);
		
		
		return ngoRepository.save(ng);
	}
	@GetMapping("/ngos")
	public List<ngo> fetchAll()
	{
		List<ngo> ls = ngoRepository.findAll();
		return ls;
	}
	@PutMapping("/changeNGOApplicationStatus/{id}")
	public ngo changeStatus(@Valid @PathVariable("id") Long id,@RequestParam("status") String status) {
		Optional<ngo> a = ngoRepository.findById(id);
		ngo ap = a.get();
		ap.setStatus(status);
		return ngoRepository.save(ap);
	}
}

