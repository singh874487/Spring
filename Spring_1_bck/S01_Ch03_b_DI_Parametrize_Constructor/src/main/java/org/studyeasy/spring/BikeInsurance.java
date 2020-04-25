package org.studyeasy.spring;

public class BikeInsurance implements Insurance {

	private String name;
	private int insuranceId;

	public BikeInsurance(String name, int insuranceId) {
		this.name = name;
		this.insuranceId = insuranceId;
	}

	BikeInsurance() {
		this.name = "Ram";
		this.insuranceId = 000;
	}

	public String showStatus() {

		return "Hi "+name +" Your Bike is Insured."+" Your Insurance Id is "+insuranceId;
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

}
