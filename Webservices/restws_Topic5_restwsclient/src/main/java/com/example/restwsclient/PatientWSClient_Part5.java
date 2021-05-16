package com.example.restwsclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.restwsclient.model.Patient;

public class PatientWSClient_Part5 {

	private static final String PATIENT_SERVICE_URL = "http://localhost:8080/restws_part4/services/patientservice";

	public static void main(String[] args) {

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(PATIENT_SERVICE_URL).path("/patients").path("/{id}").resolveTemplate("id",
				123);

		// deleting a resource/object using id
		WebTarget deleteTarget = client.target(PATIENT_SERVICE_URL).path("/patients").path("/{id}")
				.resolveTemplate("id", 125);
		Response deleteResponse = deleteTarget.request().delete();
		System.out.println("Delete Response : " + deleteResponse.getStatus());

		client.close();

	}

}
