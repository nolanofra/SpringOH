package org.isf.spring.oh.repository.jdbc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "HOSPITAL")
public class Hospital {

	 @Column(name = "HOS_ID_A")
	 private String id;
	
	  @Column(name = "HOS_NAME")
	  private String name;
	  
	  public String getId(){
		  return this.id;
	  }
	  
	  public void setId(String id){
		  this.id = id;
	  }
	  
	  
	  public String getName(){
		  return this.name;
	  }
	  
	  public void setName(String name){
		  this.name = name;
	  }
	  
	  public boolean isNew() {
	        return (this.id == null);
	    }
	
}
