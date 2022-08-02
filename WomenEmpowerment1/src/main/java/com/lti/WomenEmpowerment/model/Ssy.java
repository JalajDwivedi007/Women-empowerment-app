package com.lti.WomenEmpowerment.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="ssy")
public class Ssy {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long ssyId;
    String ssyname;
    @OneToOne(cascade=CascadeType.ALL)
	Application a;
    
	public Application getA() {
		return a;
	}
	public void setA(Application a) {
		this.a = a;
	}
	public Long getSsyId() {
		return ssyId;
	}
	public void setSsyId(Long ssyId) {
		this.ssyId = ssyId;
	}
	public String getSsyname() {
		return ssyname;
	}
	public void setSsyname(String ssyname) {
		this.ssyname = ssyname;
	}
	public Ssy(Long ssyId, String ssyname) {
		super();
		this.ssyId = ssyId;
		this.ssyname = ssyname;
	}
	public Ssy() {
		super();
	}
    
	

}
