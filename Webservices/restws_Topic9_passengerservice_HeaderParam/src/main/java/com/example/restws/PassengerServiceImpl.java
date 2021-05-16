package com.example.restws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restws.model.Passenger;

@Service
public class PassengerServiceImpl implements PassengerService {

	List<Passenger> passengers = new ArrayList<>();

	int currentId = 123;

	@Override
	public List<Passenger> getPassengers(int start, int size) {
		System.out.println("start : " + start);
		System.out.println("size : " + size);

		return passengers;
	}

	@Override
	public void addPassenger(String firstName, String lastName, String agent) {
		System.out.println("firstName : " + firstName);
		System.out.println("lastName : " + lastName);
		System.out.println("agent : " + agent);
		

	}

}

// localhost:8080/restinjection/services/passengerservice/passengers
// add Header detail in postman
// add body with x-www-form-urlencoded details