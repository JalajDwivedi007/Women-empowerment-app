package com.lti.WomenEmpowerment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name="familydetails")
public class FamilyDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long familyId;
	String guardianFirstname;
	String guardianMiddlename;
	String guardianLastname;
//	String guardianState;
//	String guardianCity;
//	String guardianAddress;
	String guardianEducationDetails;
	String guardianRealtion;
	long guardianMobile;
//	@JsonBackReference
	@OneToOne
	Application a;
	public FamilyDetails() {
		super();
	}
	public FamilyDetails(Long familyId, String guardianFirstname, String guardianMiddlename, String guardianLastname,
			String guardianState, String guardianCity, String guardianAddress, String guardianEducationDetails,
			String guardianRealtion, long guardianMobile, String guardianemail) {
		super();
		this.familyId = familyId;
		this.guardianFirstname = guardianFirstname;
		this.guardianMiddlename = guardianMiddlename;
		this.guardianLastname = guardianLastname;
		this.guardianEducationDetails = guardianEducationDetails;
		this.guardianRealtion = guardianRealtion;
		this.guardianMobile = guardianMobile;
		this.guardianemail = guardianemail;
	}
	public Long getFamilyId() {
		return familyId;
	}
	public void setFamilyId(Long familyId) {
		this.familyId = familyId;
	}
	public String getGuardianFirstname() {
		return guardianFirstname;
	}
	public void setGuardianFirstname(String guardianFirstname) {
		this.guardianFirstname = guardianFirstname;
	}
	public String getGuardianMiddlename() {
		return guardianMiddlename;
	}
	public void setGuardianMiddlename(String guardianMiddlename) {
		this.guardianMiddlename = guardianMiddlename;
	}
	public String getGuardianLastname() {
		return guardianLastname;
	}
	public void setGuardianLastname(String guardianLastname) {
		this.guardianLastname = guardianLastname;
	}
	public String getGuardianEducationDetails() {
		return guardianEducationDetails;
	}
	public void setGuardianEducationDetails(String guardianEducationDetails) {
		this.guardianEducationDetails = guardianEducationDetails;
	}
	public String getGuardianRealtion() {
		return guardianRealtion;
	}
	public void setGuardianRealtion(String guardianRealtion) {
		this.guardianRealtion = guardianRealtion;
	}
	public long getGuardianMobile() {
		return guardianMobile;
	}
	public void setGuardianMobile(long guardianMobile) {
		this.guardianMobile = guardianMobile;
	}
	public String getGuardianemail() {
		return guardianemail;
	}
	public void setGuardianemail(String guardianemail) {
		this.guardianemail = guardianemail;
	}
	String guardianemail;
	

}