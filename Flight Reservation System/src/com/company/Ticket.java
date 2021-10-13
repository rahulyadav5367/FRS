package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Ticket {
    public long pnrNumber;
    public String departure;
    public String destination;
    public int price;
    public boolean isConfirmed;
    Flight flight = new Flight();
    Passenger passenger;

    public Ticket(long pnrNumber, String departure, String destination,
                  boolean isConfirmed, Flight flight, Passenger passenger, int price) {
        this.pnrNumber = pnrNumber;
        this.departure = departure;
        this.destination = destination;
        this.isConfirmed = isConfirmed;
        this.flight = flight;
        this.passenger = passenger;
        if (isConfirmed == true)
            updateSeats();
        this.price = price;
    }

    public String ticketDetails() {
        return pnrNumber + ", " + departure + ", " + destination;
    }

    public boolean getStatus() {
        return isConfirmed;
    }

    public Flight getFlight() {
        return flight;
    }

    public String durationOfJourney() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date t1 = format.parse(flight.getTimeOfDeparture());
        Date t2 = format.parse(flight.getTimeOfArrival());

        long duration = Math.abs(t2.getTime() - t1.getTime());
        long seconds = duration / 1000 % 60;
        long minutes = duration / (60 * 1000) % 60;
        long hours = duration / (60 * 60 * 1000) % 24;
        return "Duration of journey : " + hours + " hours " + minutes + " minutes " + seconds + " seconds";
    }

    public void updateSeats() {
        if (isConfirmed == true)
            flight.setBookedSeats(flight.getBookedSeats() + 1);
    }

    public void cancelTicket() {
        isConfirmed = false;
        flight.setBookedSeats(flight.getBookedSeats() - 1);
    }

    public void confirmTicket() {
        isConfirmed = true;
        updateSeats();
    }

   /* public long getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(long pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }*/
}
