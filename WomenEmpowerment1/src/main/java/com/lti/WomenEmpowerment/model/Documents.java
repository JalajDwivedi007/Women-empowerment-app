package com.lti.WomenEmpowerment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "filedb")
public class Documents {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Long id;

	private String fileName;

	private String fileType;

	@Lob
	private byte[] data;
	
	@OneToOne
	Application a;

	@OneToOne
	ngo n;
	public Application getA() {
		return a;
	}

	public void setA(Application a) {
		this.a = a;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public Documents(String fileName, String fileType, byte[] data) {
		super();
//		this.id = id;
		this.fileName = fileName;
		this.fileType = fileType;
		this.data = data;
	}

	public Documents() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
