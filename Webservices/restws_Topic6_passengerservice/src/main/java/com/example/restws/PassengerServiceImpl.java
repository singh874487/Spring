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
	public List<Passenger> getPassengers() {

		return passengers;
	}

	@Override
	public Passenger addPassenger(Passenger passenger) {
		passenger.setId(currentId++);
		passengers.add(passenger);

		return passenger;
	}

}
