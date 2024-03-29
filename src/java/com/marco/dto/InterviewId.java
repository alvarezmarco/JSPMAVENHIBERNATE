package com.marco.dto;
// Generated Aug 24, 2013 3:56:56 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * InterviewId generated by hbm2java
 */
public class InterviewId  implements java.io.Serializable {


     private String dniNumber;
     private String cifCode;
     private Date interviewDate;

    public InterviewId() {
    }

    public InterviewId(String dniNumber, String cifCode, Date interviewDate) {
       this.dniNumber = dniNumber;
       this.cifCode = cifCode;
       this.interviewDate = interviewDate;
    }
   
    public String getDniNumber() {
        return this.dniNumber;
    }
    
    public void setDniNumber(String dniNumber) {
        this.dniNumber = dniNumber;
    }
    public String getCifCode() {
        return this.cifCode;
    }
    
    public void setCifCode(String cifCode) {
        this.cifCode = cifCode;
    }
    public Date getInterviewDate() {
        return this.interviewDate;
    }
    
    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof InterviewId) ) return false;
		 InterviewId castOther = ( InterviewId ) other; 
         
		 return ( (this.getDniNumber()==castOther.getDniNumber()) || ( this.getDniNumber()!=null && castOther.getDniNumber()!=null && this.getDniNumber().equals(castOther.getDniNumber()) ) )
 && ( (this.getCifCode()==castOther.getCifCode()) || ( this.getCifCode()!=null && castOther.getCifCode()!=null && this.getCifCode().equals(castOther.getCifCode()) ) )
 && ( (this.getInterviewDate()==castOther.getInterviewDate()) || ( this.getInterviewDate()!=null && castOther.getInterviewDate()!=null && this.getInterviewDate().equals(castOther.getInterviewDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getDniNumber() == null ? 0 : this.getDniNumber().hashCode() );
         result = 37 * result + ( getCifCode() == null ? 0 : this.getCifCode().hashCode() );
         result = 37 * result + ( getInterviewDate() == null ? 0 : this.getInterviewDate().hashCode() );
         return result;
   }   


}


