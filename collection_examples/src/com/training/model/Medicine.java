package com.training.model;

import java.time.LocalDateTime;
import java.util.Objects;

import com.training.exceptions.RangeCheckException;

public class Medicine  implements Comparable<Medicine>{

	 private int id;
	 private String medicineName;
	 private String genericName;
	 private double ratePerUnit;
	 private boolean prescriptionRequired;
	 
	public Medicine() {
		super();
	}
	
	
	public Medicine(double ratePerUnit, boolean prescriptionRequired)  throws Exception{
 		this("sample",ratePerUnit,prescriptionRequired);
		this.ratePerUnit = ratePerUnit;
		this.prescriptionRequired = prescriptionRequired;
	}


	public Medicine(String genericName, double ratePerUnit, boolean prescriptionRequired)  throws Exception{
     this("paraceptmol",genericName,ratePerUnit,prescriptionRequired);
		this.genericName = genericName;
		this.ratePerUnit = ratePerUnit;
		this.prescriptionRequired = prescriptionRequired;
	}


	public Medicine(String medicineName, String genericName, double ratePerUnit, boolean prescriptionRequired) throws Exception {
      this(000,medicineName,genericName,ratePerUnit,prescriptionRequired);
  
		this.medicineName = medicineName;
		this.genericName = genericName;
		this.ratePerUnit = ratePerUnit;
		this.prescriptionRequired = prescriptionRequired;
	}


	public Medicine(int id, String medicineName, String genericName, double ratePerUnit, boolean prescriptionRequired) 
	 throws RangeCheckException{
		super();
		this.id = id;
		this.medicineName = medicineName;
		this.genericName = genericName;
		this.prescriptionRequired = prescriptionRequired;
		
		if(ratePerUnit <=0) {
			throw new RangeCheckException("ERR-101","Should be a positive Number",LocalDateTime.now());
		} else {
			this.ratePerUnit = ratePerUnit;
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getGenericName() {
		return genericName;
	}
	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) throws RangeCheckException {
		if(ratePerUnit<=0) {
			throw new RangeCheckException("ERR-101","Should be Positive Number",LocalDateTime.now());
				} else {
					this.ratePerUnit = ratePerUnit;

				}
	}
	public boolean isPrescriptionRequired() {
		
		return prescriptionRequired;
	}
	public void setPrescriptionRequired(boolean prescriptionRequired) {
		this.prescriptionRequired = prescriptionRequired;
	}


	

	@Override
	public String toString() {
		return  id + "," +medicineName+ "," + genericName+ ","+ ratePerUnit + ","+ 
	            prescriptionRequired;
	}


	@Override
	public int hashCode() {
		return Objects.hash(genericName, id, medicineName, prescriptionRequired, ratePerUnit);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicine other = (Medicine) obj;
		return Objects.equals(genericName, other.genericName) && id == other.id
				&& Objects.equals(medicineName, other.medicineName)
				&& prescriptionRequired == other.prescriptionRequired
				&& Double.doubleToLongBits(ratePerUnit) == Double.doubleToLongBits(other.ratePerUnit);
	}


	@Override
	public int compareTo(Medicine otherObj) {
		return this.medicineName.compareTo(otherObj.medicineName);
		
	}


	

	 
	
	 
	 
}
 
 
