package com.company;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;

public class Flight {
    private int flightNumber;
    private String flightAirline;
    private String flightName;
    private int capacity;
    private int bookedSeats=0;
    private String dateOfDeparture;
    private String timeOfDeparture;
    private String dateOfArrival;
    private String timeOfArrival;

    public int checkSeatAvailability(){
        return capacity - bookedSeats;
    }

    public String getFlightDetails() {
        return "Flight Number: " + flightNumber + ", Flight Name: " + flightName + ", Airline Name: " + flightAirline + ", no of Seats: " +
                capacity + ", available no of seats: " + checkSeatAvailability();
    }

    public Flight(Flight flight) {
        this(flight.flightNumber,flight.flightName, flight.flightAirline, flight.capacity, flight.dateOfDeparture, flight.dateOfArrival,
                flight.timeOfDeparture, flight.timeOfArrival);
    }

    public Flight(int flightNumber,String flightName, String flightAirline, int capacity, String dateOfDeparture, String dateOfArrival,
                  String timeOfDeparture, String timeOfArrival) {
        this.flightNumber = flightNumber;
        this.flightName = flightName;
        this.flightAirline = flightAirline;
        this.capacity = capacity;
        this.dateOfDeparture = dateOfDeparture;
        this.dateOfArrival = dateOfArrival;
        this.timeOfDeparture = timeOfDeparture;
        this.timeOfArrival = timeOfArrival;
    }

    public Flight() {

    }

public int getFlightNumber() {
    return flightNumber;
}

    public void setFlightName(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getAirline() {
        return flightAirline;
    }

    public void setAirline(String flightAirline) {
        this.flightAirline = flightAirline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    public void setDateOfDeparture(String dateOfDeparture) {
        this.dateOfDeparture = dateOfDeparture;
    }

    public String getDateOfArrival() {
        return dateOfArrival;
    }

    public void setDateOfArrival(String dateOfArrival) {
        this.dateOfArrival = dateOfArrival;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(String timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }

}
