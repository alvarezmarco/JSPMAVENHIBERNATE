package com.marco.dto;
// Generated Aug 24, 2013 3:56:56 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Company generated by hbm2java
 */
public class Company  implements java.io.Serializable {


     private String cifCode;
     private String name;
     private Date creationTime;
     private String address;
     private String sector;
     private Set interviews = new HashSet(0);
     private Set workeds = new HashSet(0);

    public Company() {
    }

	
    public Company(String cifCode, String name, Date creationTime) {
        this.cifCode = cifCode;
        this.name = name;
        this.creationTime = creationTime;
    }
    public Company(String cifCode, String name, Date creationTime, String address, String sector, Set interviews, Set workeds) {
       this.cifCode = cifCode;
       this.name = name;
       this.creationTime = creationTime;
       this.address = address;
       this.sector = sector;
       this.interviews = interviews;
       this.workeds = workeds;
    }
   
    public String getCifCode() {
        return this.cifCode;
    }
    
    public void setCifCode(String cifCode) {
        this.cifCode = cifCode;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Date getCreationTime() {
        return this.creationTime;
    }
    
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getSector() {
        return this.sector;
    }
    
    public void setSector(String sector) {
        this.sector = sector;
    }
    public Set getInterviews() {
        return this.interviews;
    }
    
    public void setInterviews(Set interviews) {
        this.interviews = interviews;
    }
    public Set getWorkeds() {
        return this.workeds;
    }
    
    public void setWorkeds(Set workeds) {
        this.workeds = workeds;
    }




}


