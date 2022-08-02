package com.lti.WomenEmpowerment.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="training")
public class Training {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long traineeId;
	@OneToOne(cascade=CascadeType.ALL)
	Application a;
	public Application getA() {
		return a;
	}
	public void setA(Application a) {
		this.a = a;
	}
	public Training() {
		super();
	}
	public Training(Long traineeId, String title, String providedBy, String aboutTra) {
		super();
		this.traineeId = traineeId;
		this.title = title;
		this.providedBy = providedBy;
		this.aboutTra = aboutTra;
	}
	public Long getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(Long traineeId) {
		this.traineeId = traineeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProvidedBy() {
		return providedBy;
	}
	public void setProvidedBy(String providedBy) {
		this.providedBy = providedBy;
	}
	public String getAboutTra() {
		return aboutTra;
	}
	public void setAboutTra(String aboutTra) {
		this.aboutTra = aboutTra;
	}
	String title;
	String providedBy;
	String aboutTra;
	
	
	

}
