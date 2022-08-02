package com.lti.WomenEmpowerment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.lti.WomenEmpowerment.model.Documents;
import com.lti.WomenEmpowerment.repo.DocumentsRepository;

@Service
public class DocumentsService {
	@Autowired
	private DocumentsRepository documentRepository;
	
	public String saveFile(MultipartFile file) {
		String docname = file.getOriginalFilename();
		try {
			Documents doc = new Documents(docname,file.getContentType(),file.getBytes());
			documentRepository.save(doc);
			return "{\"status\" : \""+docname+" Submitted Successfully!\"}";
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "{\"status\" : \"Some error occured!\"}";
	}
	public Optional<Documents> getFile(Long id){
		return documentRepository.findById(id);
	}
	public List<Documents> getFiles(){
		return documentRepository.findAll();
	}
	
}
