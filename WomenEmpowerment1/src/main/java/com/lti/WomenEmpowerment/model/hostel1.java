package com.lti.WomenEmpowerment.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="hostel")
public class hostel1 {
	//Hostel Info
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
			Long hId;
			String hName;
			String hLocation;
			String hRanBy;
			@OneToOne(cascade=CascadeType.ALL)
			Application a;
			public Application getA() {
				return a;
			}
			public void setA(Application a) {
				this.a = a;
			}
			public Long gethId() {
				return hId;
			}
			public void sethId(Long hId) {
				this.hId = hId;
			}
			public String gethName() {
				return hName;
			}
			public void sethName(String hName) {
				this.hName = hName;
			}
			public String gethLocation() {
				return hLocation;
			}
			public void sethLocation(String hLocation) {
				this.hLocation = hLocation;
			}
			public String gethRanBy() {
				return hRanBy;
			}
			public void sethRanBy(String hRanBy) {
				this.hRanBy = hRanBy;
			}
			public hostel1(Long hId, String hName, String hLocation, String hRanBy) {
				super();
				this.hId = hId;
				this.hName = hName;
				this.hLocation = hLocation;
				this.hRanBy = hRanBy;
			}
			public hostel1() {
				super();
			}
	

}
