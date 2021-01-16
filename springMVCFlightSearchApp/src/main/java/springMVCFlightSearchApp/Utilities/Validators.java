package springMVCFlightSearchApp.Utilities;

import java.util.HashMap;

public class Validators {

	private static boolean isValidDeparture(String departure) {

		if (departure.length() != 3 || !(departure.matches("^[a-zA-Z]*$"))) {
			return false;
		}
		return true;
	}

	private static boolean isValidArrival(String arrival, String departure) {

		if (arrival.length() != 3 || !(arrival.matches("^[a-zA-Z]*$"))) {
			return false;
		} else if (arrival.equals(departure)) {
			return false;
		}
		return true;
	}
	
public static HashMap<String,String> validationChecker(String departure,String arrival,String date,String flightClass){
		
		HashMap<String,String> errorMap=new HashMap<String,String>();
		 
		 if(!isValidDeparture(departure)) {
				errorMap.put("departure","Enter a Valid Departure location");
			}
			if(!isValidArrival(arrival, departure))
			{
				errorMap.put("arrival","Enter Valid Arrival Location");
			}
			if(date.isEmpty()) {
				errorMap.put("date","Please Select date");
			}
			if(flightClass.equals("c")) {
				errorMap.put("flightClass","Please Select Flight Class");
			}
		
		 return errorMap;
	}
}
