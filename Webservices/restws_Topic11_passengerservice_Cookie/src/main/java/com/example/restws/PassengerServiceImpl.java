package com.example.restws;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;

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
	public void addPassenger(String firstName, String lastName, String agent, HttpHeaders headers) {
		System.out.println("firstName : " + firstName);
		System.out.println("lastName : " + lastName);
		System.out.println("agent : " + agent);

		MultivaluedMap<String, String> allHeaders = headers.getRequestHeaders();
		Set<String> headerKeys = allHeaders.keySet();
		for (String key : headerKeys) {
			System.out.println("Key : " + key);
			String headerValueInStringForm = headers.getHeaderString(key);

			System.out.println("Value : " + headerValueInStringForm);

		}
		Map<String, Cookie> cookies = headers.getCookies();
		System.out.println("All Cookies : " + cookies);
		Set<String> cookieKeys = cookies.keySet();

		for (String eachCookieKey : cookieKeys) {
			System.out.println("---------------Cookies---------------");
			System.out.println(eachCookieKey);
			System.out.println(cookies.get(eachCookieKey));
		}

	}

}

// localhost:8080/restinjection/services/passengerservice/passengers
// add Header detail in postman
// add body with x-www-form-urlencoded details

// add HttpHeaders headers parameter
// iterate and print all headers