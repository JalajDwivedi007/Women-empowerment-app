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
import com.lti.WomenEmpowerment.model.FamilyDetails;
import com.lti.WomenEmpowerment.model.Training;
import com.lti.WomenEmpowerment.repo.TrainingRepo;
import com.lti.WomenEmpowerment.service.DocumentsService;
@CrossOrigin
@RestController
public class TrainingController{


@Autowired
	private TrainingRepo trainingRepository;
	@Autowired
	DocumentsService documentsService;
	@PostMapping("/training")
	public Training createTraining(@Valid @RequestParam("title") String title,
									@RequestParam("providedBy") String providedBy,
									@RequestParam("aboutTra") String aboutTra,
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
									@RequestParam("gEmail") String gEmail) throws IOException{
		Training t = new Training();
		t.setTitle(title);
		t.setProvidedBy(providedBy);
		t.setAboutTra(aboutTra);
		
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
		a.setApplicationtype("training");
		a.setF(f);
		a.setD(d);
		
		t.setA(a);
		documentsService.saveFile(file);
		
		return trainingRepository.save(t);
	}
	@GetMapping("/trainings")
	public List<Training> fetchAll()
	{
		List<Training> ls = trainingRepository.findAll();
		return ls;
	}
//	@PutMapping("/changeTrainingStatus/{id}")
//	public Training changeTraining(@Valid @RequestBody String status,@PathVariable Long id) {
//		Optional<Training> t = trainingRepository.findById(id);
//		Training tr = t.get();
//		Application a = new Application();
//		a.setStatus(status);
//		
//		tr.setA(a);
//		
//		return tr;
//	}
}

