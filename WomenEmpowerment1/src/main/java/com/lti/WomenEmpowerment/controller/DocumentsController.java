package com.lti.WomenEmpowerment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lti.WomenEmpowerment.model.Documents;
import com.lti.WomenEmpowerment.service.DocumentsService;

@RestController
@CrossOrigin
public class DocumentsController {

	@Autowired
	private DocumentsService documentsService;
	@PostMapping("/womenempowerment/uploadfiles")
	public String uploadFiles(@RequestParam("files") MultipartFile file) {
		documentsService.saveFile(file);
		return "{\"status\" : \"File uploaded successfully!\"}";
	}
	@GetMapping("/womenempowerment/getFiles")
	public List<Documents> getFiles() {
		List<Documents> ls = documentsService.getFiles();
		return ls;
	}
	@CrossOrigin
	@GetMapping("/womenempowerment/download/{id}")
	public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Long id){
		Documents doc = documentsService.getFile(id).get();
		return ResponseEntity.ok()
				.contentType(MediaType.parseMediaType(doc.getFileType()))
				.header(HttpHeaders.CONTENT_DISPOSITION,"attachment:filename=\""+doc.getFileName()+"\"")
				.body(new ByteArrayResource(doc.getData()));
	}
}
