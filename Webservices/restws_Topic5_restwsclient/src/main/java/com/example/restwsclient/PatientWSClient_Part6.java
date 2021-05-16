package com.example.restwsclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.restwsclient.model.Patient;

public class PatientWSClient_Part6 {

	private static final String PATIENT_SERVICE_URL = "http://localhost:8080/restws_part4/services/patientservice";

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(PATIENT_SERVICE_URL).path("/patients").path("/{id}").resolveTemplate("id",
				123);

		// getting the object using id
		Builder request = target.request();
		Patient patient = request.get(Patient.class);

		System.out.println(patient.getId());
		System.out.println(patient.getName());

		// updating object
		patient.setName("Arjun 5");

		WebTarget putTarget = client.target(PATIENT_SERVICE_URL).path("/patients");
		Response updateResponse = putTarget.request().put(Entity.entity(patient, MediaType.APPLICATION_XML));

		System.out.println("Update Response : "+updateResponse.getStatus());

		updateResponse.close();
		
		// creating object

		Patient newPatient = new Patient();
		newPatient.setName("Kom");

		WebTarget postTarget = client.target(PATIENT_SERVICE_URL).path("/patients");
		Patient createdPatient = postTarget.request().post(Entity.entity(newPatient, MediaType.APPLICATION_XML),
				Patient.class);

		System.out.println("Created Patient ID: " + createdPatient.getId());

		// deleting a resource/object using id
		WebTarget deleteTarget = client.target(PATIENT_SERVICE_URL).path("/patients").path("/{id}")
				.resolveTemplate("id", 125);
		Response deleteResponse = deleteTarget.request().delete();
		System.out.println("Delete Response : "+deleteResponse.getStatus());


		client.close();

	}

}
