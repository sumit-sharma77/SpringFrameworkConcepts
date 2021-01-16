package springMVCFlightSearchApp.Utilities;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import springMVCFlightSearchApp.model.FlightData;

public class SortData {

	public static List<FlightData> sortingData(List<FlightData> availableFlights, String sortedBy) {

		// comparator on fare
		Comparator<FlightData> comparatorOnFare = Comparator.comparing(FlightData::getFare);

		// comparator on fare and duration
		Comparator<FlightData> comparatorFareAndDuration = Comparator.comparing(FlightData::getFare);
		comparatorFareAndDuration = comparatorFareAndDuration.thenComparing(FlightData::getFlightDuration);

		if (sortedBy.equals("F")) {
			Collections.sort(availableFlights, comparatorOnFare);
			return availableFlights;
		} else {
			Collections.sort(availableFlights, comparatorFareAndDuration);
			return availableFlights;
		}
	}
}
