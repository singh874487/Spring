package org.studyeasy.spring;

public class BikeInsurance implements Insurance {

	String currentOffer_1, currentOffer_2;

	String x, y;
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

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}
