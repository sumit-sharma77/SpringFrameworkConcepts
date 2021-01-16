package springMVCFlightSearchApp.Dao;

import java.util.List;

import springMVCFlightSearchApp.model.FlightData;

public interface FlightDataDao {

	public void insertFlightData(FlightData flightdata);
	public List<FlightData> getAllAvailableFlights();
}
