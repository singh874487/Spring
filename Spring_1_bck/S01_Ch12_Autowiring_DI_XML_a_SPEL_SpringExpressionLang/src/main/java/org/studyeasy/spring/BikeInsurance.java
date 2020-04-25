package org.studyeasy.spring;

public class BikeInsurance implements Insurance {
	
	String currentOffer_1;
	String currentOffer_2;
	String currentOffer_3;
	String currentOffer_4;
	String x,y;
	int z;
	
	public String showStatus() {
		return "Your Bike is Insured";
	}

	public String getCurrentOffer_1() {
		return currentOffer_1;
	}

	public void setCurrentOffer_1(String currentOffer_1) {
		this.currentOffer_1 = currentOffer_1;
	}

	public String getCurrentOffer_2() {
		return currentOffer_2;
	}

	public void setCurrentOffer_2(String currentOffer_2) {
		this.currentOffer_2 = currentOffer_2;
	}

	public String getCurrentOffer_3() {
		return currentOffer_3;
	}

	public void setCurrentOffer_3(String currentOffer_3) {
		this.currentOffer_3 = currentOffer_3;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public String getCurrentOffer_4() {
		return currentOffer_4;
	}

	public void setCurrentOffer_4(String currentOffer_4) {
		this.currentOffer_4 = currentOffer_4;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	 
}

