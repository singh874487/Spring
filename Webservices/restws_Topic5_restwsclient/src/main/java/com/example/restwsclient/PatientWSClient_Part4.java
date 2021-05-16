package com.example.restwsclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.restwsclient.model.Patient;

public class PatientWSClient_Part4 {

	private static final String PATIENT_SERVICE_URL = "http://localhost:8080/restws_part4/services/patientservice";

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
	 
		Patient newPatient = new Patient();
		newPatient.setName("XOM");

		WebTarget postTarget = client.target(PATIENT_SERVICE_URL).path("/patients");
		Patient createdPatient = postTarget.request().post(Entity.entity(newPatient, MediaType.APPLICATION_XML),
				Patient.class);

		System.out.println("Created Patient ID: " + createdPatient.getId());
		
		client.close();

	}

}
