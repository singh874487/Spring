package com.example.restws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.example.restws.model.Passenger;

@Path("/passengerservice")
@Consumes("application/xml")
@Produces("application/xml")
public interface PassengerService {

	@Path("/passengers")
	@GET
	List<Passenger> getPassengers();

	@Path("/passengers")
	@POST
	Passenger addPassenger(Passenger passenger);

}
