package com.lti.WomenEmpowerment.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name="application")
public class Application {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long applicationId;
	String username;
	String status;
	String applicationtype;
	public String getApplicationtype() {
		return applicationtype;
	}
	public void setApplicationtype(String applicationtype) {
		this.applicationtype = applicationtype;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	String traineeFirstname;
	String traineeMiddlename;
	String traineeLastname;
	String traineeState;
	String traineeCity;
	String traineeAddress;
	String traineePan;
	String traineeEducationDetails;
	long traineeAadhaar;
//	@JsonBackReference
	@OneToOne
	hostel1 h;
	@OneToOne
	ngo n;
	@OneToOne
	Ssy s;
	@OneToOne
	Training t;
	public ngo getN() {
		return n;
	}
	public void setN(ngo n) {
		this.n = n;
	}
	public Ssy getS() {
		return s;
	}
	public void setS(Ssy s) {
		this.s = s;
	}
	public Training getT() {
		return t;
	}
	public void setT(Training t) {
		this.t = t;
	}
	public hostel1 getH() {
		return h;
	}
	public void setH(hostel1 h) {
		this.h = h;
	}
	@OneToOne(cascade=CascadeType.ALL)
	Documents d;
	@OneToOne(cascade=CascadeType.ALL)
	FamilyDetails f;
	public Documents getD() {
		return d;
	}
	public void setD(Documents d) {
		this.d = d;
	}
	public FamilyDetails getF() {
		return f;
	}
	public void setF(FamilyDetails f) {
		this.f = f;
	}
	
	
	public Long getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
	public String getTraineeFirstname() {
		return traineeFirstname;
	}
	public void setTraineeFirstname(String traineeFirstname) {
		this.traineeFirstname = traineeFirstname;
	}
	public String getTraineeMiddlename() {
		return traineeMiddlename;
	}
	public void setTraineeMiddlename(String traineeMiddlename) {
		this.traineeMiddlename = traineeMiddlename;
	}
	public String getTraineeLastname() {
		return traineeLastname;
	}
	public void setTraineeLastname(String traineeLastname) {
		this.traineeLastname = traineeLastname;
	}
	public String getTraineeState() {
		return traineeState;
	}
	public void setTraineeState(String traineeState) {
		this.traineeState = traineeState;
	}
	public String getTraineeCity() {
		return traineeCity;
	}
	public void setTraineeCity(String traineeCity) {
		this.traineeCity = traineeCity;
	}
	public String getTraineeAddress() {
		return traineeAddress;
	}
	public void setTraineeAddress(String traineeAddress) {
		this.traineeAddress = traineeAddress;
	}
	public String getTraineePan() {
		return traineePan;
	}
	public void setTraineePan(String traineePan) {
		this.traineePan = traineePan;
	}
	public String getTraineeEducationDetails() {
		return traineeEducationDetails;
	}
	public void setTraineeEducationDetails(String traineeEducationDetails) {
		this.traineeEducationDetails = traineeEducationDetails;
	}
	public long getTraineeAadhaar() {
		return traineeAadhaar;
	}
	public void setTraineeAadhaar(long traineeAadhaar) {
		this.traineeAadhaar = traineeAadhaar;
	}
	public Application(Long applicationId, String traineeFirstname, String traineeMiddlename, String traineeLastname,
			String traineeState, String traineeCity, String traineeAddress, String traineePan,
			String traineeEducationDetails, long traineeAadhaar) {
		super();
		this.applicationId = applicationId;
		this.traineeFirstname = traineeFirstname;
		this.traineeMiddlename = traineeMiddlename;
		this.traineeLastname = traineeLastname;
		this.traineeState = traineeState;
		this.traineeCity = traineeCity;
		this.traineeAddress = traineeAddress;
		this.traineePan = traineePan;
		this.traineeEducationDetails = traineeEducationDetails;
		this.traineeAadhaar = traineeAadhaar;
	}
	public Application() {
		super();
	}
	
}
