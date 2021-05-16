package com.example.restwsclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class PatientWSClient_Part1 {

	public static void main(String[] args) {

		
	// check the given id exist and print the status
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/restws_part4/services/patientservice/patients/124");
		
		Builder request = target.request();
		Response response = request.get();
		
		System.out.println(response.getStatus());
		
		
		
	}

}
