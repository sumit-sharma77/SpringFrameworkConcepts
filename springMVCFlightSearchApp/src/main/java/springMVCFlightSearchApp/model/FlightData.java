package springMVCFlightSearchApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlightData {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String csvName;
    private String flightNo;
    private String departure;
    private String arrival;
    private String date;
    private String flightTime;
    private String flightDuration;
    private double fare;
    private String seatAvailability;
    private String flightClass;
    
    
	public FlightData(String csvName, String flightNo, String departure, String arrival, String date, String flightTime,
			String flightDuration, double fare, String seatAvailability, String flightClass) {
		super();
		this.csvName = csvName;
		this.flightNo = flightNo;
		this.departure = departure;
		this.arrival = arrival;
		this.date = date;
		this.flightTime = flightTime;
		this.flightDuration = flightDuration;
		this.fare = fare;
		this.seatAvailability = seatAvailability;
		this.flightClass = flightClass;
	}
	
	public FlightData() {

	}

	public String getCsvName() {
		return csvName;
	}
	public void setCsvName(String csvName) {
		this.csvName = csvName;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFlightTime() {
		return flightTime;
	}
	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}
	public String getFlightDuration() {
		return flightDuration;
	}
	public void setFlightDuration(String flightDuration) {
		this.flightDuration = flightDuration;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String getSeatAvailability() {
		return seatAvailability;
	}
	public void setSeatAvailability(String seatAvailability) {
		this.seatAvailability = seatAvailability;
	}
	public String getFlightClass() {
		return flightClass;
	}
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public FlightData(int id, String csvName, String flightNo, String departure, String arrival, String date,
			String flightTime, String flightDuration, double fare, String seatAvailability, String flightClass) {
		super();
		this.id = id;
		this.csvName = csvName;
		this.flightNo = flightNo;
		this.departure = departure;
		this.arrival = arrival;
		this.date = date;
		this.flightTime = flightTime;
		this.flightDuration = flightDuration;
		this.fare = fare;
		this.seatAvailability = seatAvailability;
		this.flightClass = flightClass;
	}
	
    

}
