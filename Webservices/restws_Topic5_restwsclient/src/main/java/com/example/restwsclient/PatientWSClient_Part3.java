package com.example.restwsclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.restwsclient.model.Patient;

public class PatientWSClient_Part3 {

	private static final String PATIENT_SERVICE_URL = "http://localhost:8080/restws_part4/services/patientservice";

	public static void main(String[] args) {

		// check the given id exist or not and print the object details and then update the object and save it back
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(PATIENT_SERVICE_URL).path("/patients").path("/{id}").resolveTemplate("id", 124);
		
		Builder request = target.request();
		Patient patient = request.get(Patient.class);
		
		System.out.println(patient.getId());
		System.out.println(patient.getName());
		
		patient.setName("Arjun");
		
		WebTarget putTarget = client.target(PATIENT_SERVICE_URL).path("/patients");
		Response updateResponse = putTarget.request().put(Entity.entity(patient, MediaType.APPLICATION_XML));
		
		System.out.println(updateResponse.getStatus());
		
		
	}

}
