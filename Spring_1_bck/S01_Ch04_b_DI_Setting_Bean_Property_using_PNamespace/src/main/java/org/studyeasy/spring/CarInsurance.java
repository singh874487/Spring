package org.studyeasy.spring;

public class CarInsurance implements Insurance {

	private String name;
	private int insuranceId;

	public CarInsurance(String name, int insuranceId) {
		this.name = name;
		this.insuranceId = insuranceId;
	}

	CarInsurance() {
		this.name = "Ram";
		this.insuranceId = 000;
	}

	public String showStatus() {

		return "Hi "+name +" Your Car is Insured."+" Your Insurance Id is "+insuranceId;
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
