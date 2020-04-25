package org.studyeasy.spring;

public class BikeInsurance implements Insurance {

	private String name;
	private int insuranceId;
	private int insuranceValidity;

	public BikeInsurance(String name, int insuranceId) {
		this.name = name;
		this.insuranceId = insuranceId;
	}

	BikeInsurance() {
		this.name = "Ram";
		this.insuranceId = 000;
	}

	public String showStatus() {

		return "Hi "+name +" Your Bike is Insured."+" Your Insurance Id is "+insuranceId  + " and with validity till year "+insuranceValidity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}

	public int getInsuranceValidity() {
		return insuranceValidity;
	}

	
	public void setInsuranceValidity(int insuranceValidity) {
		this.insuranceValidity = insuranceValidity;
	}



	@Override
	public String toString() {
		return "BikeInsurance [name=" + name + ", insuranceId=" + insuranceId + ", insuranceValidity="
				+ insuranceValidity + "]";
	}

	
}
