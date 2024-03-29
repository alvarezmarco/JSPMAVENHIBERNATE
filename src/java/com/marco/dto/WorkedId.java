package com.marco.dto;
// Generated Aug 24, 2013 3:56:56 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * WorkedId generated by hbm2java
 */
public class WorkedId  implements java.io.Serializable {


     private String dniNumber;
     private Date initDate;

    public WorkedId() {
    }

    public WorkedId(String dniNumber, Date initDate) {
       this.dniNumber = dniNumber;
       this.initDate = initDate;
    }
   
    public String getDniNumber() {
        return this.dniNumber;
    }
    
    public void setDniNumber(String dniNumber) {
        this.dniNumber = dniNumber;
    }
    public Date getInitDate() {
        return this.initDate;
    }
    
    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof WorkedId) ) return false;
		 WorkedId castOther = ( WorkedId ) other; 
         
		 return ( (this.getDniNumber()==castOther.getDniNumber()) || ( this.getDniNumber()!=null && castOther.getDniNumber()!=null && this.getDniNumber().equals(castOther.getDniNumber()) ) )
 && ( (this.getInitDate()==castOther.getInitDate()) || ( this.getInitDate()!=null && castOther.getInitDate()!=null && this.getInitDate().equals(castOther.getInitDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getDniNumber() == null ? 0 : this.getDniNumber().hashCode() );
         result = 37 * result + ( getInitDate() == null ? 0 : this.getInitDate().hashCode() );
         return result;
   }   


}


