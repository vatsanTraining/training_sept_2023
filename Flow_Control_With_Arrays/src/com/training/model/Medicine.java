package com.training.model;

 public class Medicine {

	 private int id;
	 private String medicineName;
	 private String genericName;
	 private double ratePerUnit;
	 private boolean prescriptionRequired;
	 
	public Medicine() {
		super();
	}
	
	
	public Medicine(double ratePerUnit, boolean prescriptionRequired) {
 		this("sample",ratePerUnit,prescriptionRequired);
		this.ratePerUnit = ratePerUnit;
		this.prescriptionRequired = prescriptionRequired;
	}


	public Medicine(String genericName, double ratePerUnit, boolean prescriptionRequired) {
     this("paraceptmol",genericName,ratePerUnit,prescriptionRequired);
		this.genericName = genericName;
		this.ratePerUnit = ratePerUnit;
		this.prescriptionRequired = prescriptionRequired;
	}


	public Medicine(String medicineName, String genericName, double ratePerUnit, boolean prescriptionRequired) {
      this(000,medicineName,genericName,ratePerUnit,prescriptionRequired);
  
		this.medicineName = medicineName;
		this.genericName = genericName;
		this.ratePerUnit = ratePerUnit;
		this.prescriptionRequired = prescriptionRequired;
	}


	public Medicine(int id, String medicineName, String genericName, double ratePerUnit, boolean prescriptionRequired) {
		super();
		this.id = id;
		this.medicineName = medicineName;
		this.genericName = genericName;
		this.ratePerUnit = ratePerUnit;
		this.prescriptionRequired = prescriptionRequired;
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
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public boolean isPrescriptionRequired() {
		
		return prescriptionRequired;
	}
	public void setPrescriptionRequired(boolean prescriptionRequired) {
		this.prescriptionRequired = prescriptionRequired;
	}
	 
	
	 
	 
}
 
 
