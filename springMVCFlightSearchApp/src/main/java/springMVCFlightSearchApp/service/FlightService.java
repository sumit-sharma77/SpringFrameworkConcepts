package springMVCFlightSearchApp.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMVCFlightSearchApp.Constants.Constants;
import springMVCFlightSearchApp.Dao.FlightDataDao;
import springMVCFlightSearchApp.Utilities.Validators;
import springMVCFlightSearchApp.model.FlightData;

@Service
public class FlightService {

	@Autowired
	private FlightDataDao flightDataDao;

	public List<FlightData> searchFlights(String departure, String arrival, String date, String flightClass,
			String sortedBy) {
		
		//storing available flights data from database
		List<FlightData> availableFlights = flightDataDao.getAllAvailableFlights();
		//List for storing matched requested flights
		List<FlightData> foundFlights = new LinkedList<FlightData>();
		
		for (FlightData avFlights : availableFlights) {

			if (avFlights.getDeparture().equals(departure) && avFlights.getArrival().equals(arrival)
					&& dateChecker(date, avFlights) && avFlights.getFlightClass().contains(flightClass)) {

				FlightData intermediateObj = avFlights;

				if (flightClass.equals(Constants.BUSINESS)) {

					intermediateObj.setFlightClass("Business");
					double fare = avFlights.getFare();
					double updatedFare = fare + (fare * 0.4);
					intermediateObj.setFare(updatedFare);

				} else {
					intermediateObj.setFlightClass("Economy");
				}
				intermediateObj.setDate(date);
				foundFlights.add(intermediateObj);
			}
		}
		return foundFlights;
	}
	
	private boolean dateChecker(String date, FlightData avFlights) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd-MM-uuuu");
		LocalDate avFlightDate = LocalDate.parse(avFlights.getDate(), dateTimeFormatter2);
		LocalDate userDate = LocalDate.parse(date, dateTimeFormatter);
		if (avFlightDate.compareTo(userDate) < 0)
			return false; // if date in flight data occurs before the date entered by user

		return true;
	}
	
	

}
