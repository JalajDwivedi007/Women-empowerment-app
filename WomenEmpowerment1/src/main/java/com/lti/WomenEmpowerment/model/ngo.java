package com.lti.WomenEmpowerment.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ngo")
public class ngo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long ngoId;
	String username;
	String status;
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
	@OneToOne(cascade=CascadeType.ALL)
	Documents d;
	public Documents getD() {
		return d;
	}
	public void setD(Documents d) {
		this.d = d;
	}
	public ngo() {
		super();
	}
	public Long getNgoId() {
		return ngoId;
	}
	public void setNgoId(Long ngoId) {
		this.ngoId = ngoId;
	}
	public String getNgoName() {
		return ngoName;
	}
	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}
	public int getMembers() {
		return members;
	}
	public void setMembers(int members) {
		this.members = members;
	}
	public String getWorkAreas() {
		return workAreas;
	}
	public void setWorkAreas(String workAreas) {
		this.workAreas = workAreas;
	}
	public String getNgoState() {
		return ngoState;
	}
	public void setNgoState(String ngoState) {
		this.ngoState = ngoState;
	}
	public String getNgocity() {
		return ngocity;
	}
	public void setNgocity(String ngocity) {
		this.ngocity = ngocity;
	}
	public String getNgoAddress() {
		return ngoAddress;
	}
	public void setNgoAddress(String ngoAddress) {
		this.ngoAddress = ngoAddress;
	}
	public long getNgoRegisterationNo() {
		return ngoRegisterationNo;
	}
	public void setNgoRegisterationNo(long ngoRegisterationNo) {
		this.ngoRegisterationNo = ngoRegisterationNo;
	}
	public String getNgoDOE() {
		return ngoDOE;
	}
	public void setNgoDOE(String ngoDOE) {
		this.ngoDOE = ngoDOE;
	}
	public String getNewCampaign() {
		return newCampaign;
	}
	public void setNewCampaign(String newCampaign) {
		this.newCampaign = newCampaign;
	}
	public String getNgoProjDetails() {
		return ngoProjDetails;
	}
	public void setNgoProjDetails(String ngoProjDetails) {
		this.ngoProjDetails = ngoProjDetails;
	}
	public int getNgoAmount() {
		return ngoAmount;
	}
	public void setNgoAmount(int ngoAmount) {
		this.ngoAmount = ngoAmount;
	}
	public long getNgoMobile() {
		return ngoMobile;
	}
	public void setNgoMobile(long ngoMobile) {
		this.ngoMobile = ngoMobile;
	}
	public String getNgoEmail() {
		return ngoEmail;
	}
	public void setNgoEmail(String ngoEmail) {
		this.ngoEmail = ngoEmail;
	}
	public String getNgoWebsite() {
		return ngoWebsite;
	}
	public void setNgoWebsite(String ngoWebsite) {
		this.ngoWebsite = ngoWebsite;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public ngo(Long ngoId, String ngoName, int members, String workAreas, String ngoState, String ngocity,
			String ngoAddress, long ngoRegisterationNo, String ngoDOE, String newCampaign, String ngoProjDetails,
			int ngoAmount, long ngoMobile, String ngoEmail, String ngoWebsite, String fname, String mname, String lname,
			 String inchargeAddress,  String inchargeEdu,
			long inchargeAadhar) {
		super();
		this.ngoId = ngoId;
		this.ngoName = ngoName;
		this.members = members;
		this.workAreas = workAreas;
		this.ngoState = ngoState;
		this.ngocity = ngocity;
		this.ngoAddress = ngoAddress;
		this.ngoRegisterationNo = ngoRegisterationNo;
		this.ngoDOE = ngoDOE;
		this.newCampaign = newCampaign;
		this.ngoProjDetails = ngoProjDetails;
		this.ngoAmount = ngoAmount;
		this.ngoMobile = ngoMobile;
		this.ngoEmail = ngoEmail;
		this.ngoWebsite = ngoWebsite;
		this.fname = fname;
		this.mname = mname;
		this.lname = lname;
//		this.inchargeState = inchargeState;
//		this.inchargecity = inchargecity;
		this.inchargeAddress = inchargeAddress;
		//this.inchargePan = inchargePan;
		this.inchargeEdu = inchargeEdu;
		this.inchargeAadhar = inchargeAadhar;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
//	public String getInchargeState() {
//		return inchargeState;
//	}
//	public void setInchargeState(String inchargeState) {
//		this.inchargeState = inchargeState;
//	}
//	public String getInchargecity() {
//		return inchargecity;
//	}
//	public void setInchargecity(String inchargecity) {
//		this.inchargecity = inchargecity;
//	}
	public String getInchargeAddress() {
		return inchargeAddress;
	}
	public void setInchargeAddress(String inchargeAddress) {
		this.inchargeAddress = inchargeAddress;
	}
//	public String getInchargePan() {
//		return inchargePan;
//	}
//	public void setInchargePan(String inchargePan) {
//		this.inchargePan = inchargePan;
//	}
	public String getInchargeEdu() {
		return inchargeEdu;
	}
	public void setInchargeEdu(String inchargeEdu) {
		this.inchargeEdu = inchargeEdu;
	}
	public long getInchargeAadhar() {
		return inchargeAadhar;
	}
	public void setInchargeAadhar(long inchargeAadhar) {
		this.inchargeAadhar = inchargeAadhar;
	}
	String ngoName;
	int members;
	String workAreas;
	String ngoState;
	String ngocity;
	String ngoAddress;
	long ngoRegisterationNo;
	String ngoDOE;
	String newCampaign;
	String ngoProjDetails;
	int ngoAmount;
	long ngoMobile;
	String ngoEmail;
	String ngoWebsite;
	//Project in-charge
	String fname;
	String mname;
	String lname;
	String inchargeState;
	String inchargecity;
	String inchargeAddress;
	String inchargePan;
	String inchargeEdu;
	long inchargeAadhar;
	

}
