package com.marco.dto;
// Generated Aug 24, 2013 3:56:56 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Person generated by hbm2java
 */
public class Person  implements java.io.Serializable {


     private String dniNumber;
     private String firstName;
     private String surname;
     private char gender;
     private String email;
     private String city;
     private Date dateOfBirth;
     private Set interviews = new HashSet(0);
     private Set workeds = new HashSet(0);

    public Person() {
    }

	
    public Person(String dniNumber, String firstName, String surname, char gender, String email, String city, Date dateOfBirth) {
        this.dniNumber = dniNumber;
        this.firstName = firstName;
        this.surname = surname;
        this.gender = gender;
        this.email = email;
        this.city = city;
        this.dateOfBirth = dateOfBirth;
    }
    public Person(String dniNumber, String firstName, String surname, char gender, String email, String city, Date dateOfBirth, Set interviews, Set workeds) {
       this.dniNumber = dniNumber;
       this.firstName = firstName;
       this.surname = surname;
       this.gender = gender;
       this.email = email;
       this.city = city;
       this.dateOfBirth = dateOfBirth;
       this.interviews = interviews;
       this.workeds = workeds;
    }
   
    public String getDniNumber() {
        return this.dniNumber;
    }
    
    public void setDniNumber(String dniNumber) {
        this.dniNumber = dniNumber;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public char getGender() {
        return this.gender;
    }
    
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
    
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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


