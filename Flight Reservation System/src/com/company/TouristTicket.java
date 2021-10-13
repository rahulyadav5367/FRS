package com.company;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    public String[] touristLocation = new String[5];

    public TouristTicket(long pnrNumber, String departure, String destination, boolean isConfirmed,
                         Flight flight, Passenger passenger, String hotelLocation, String[] touristLocation, int price) {
        super(pnrNumber,
                departure,
                destination,
                isConfirmed,
                flight,
                passenger,
                price);
        this.hotelAddress = hotelAddress;
        this.touristLocation = touristLocation;
    }

    void updateTouristLocation(String location1) {
        touristLocation[0] = location1;
    }

    void updateTouristLocation(String location1, String location2) {
        touristLocation[0] = location1;
        touristLocation[1] = location2;
    }

    void updateTouristLocation(String location1, String location2, String location3) {
        touristLocation[0] = location1;
        touristLocation[1] = location2;
        touristLocation[2] = location3;
    }

    void updateTouristLocation(String location1, String location2, String location3, String location4) {
        touristLocation[0] = location1;
        touristLocation[1] = location2;
        touristLocation[2] = location3;
        touristLocation[3] = location4;
    }

    void updateTouristLocation(String location1, String location2, String location3, String location4, String location5) {
        touristLocation[0] = location1;
        touristLocation[1] = location2;
        touristLocation[2] = location3;
        touristLocation[3] = location4;
        touristLocation[4] = location5;
    }

    public void removeTouristLocation(String location1) {
        for (int i = 0; i < touristLocation.length; i++)
            if (touristLocation[i].equals(location1))
                touristLocation[i] = null;
    }

    public void removeTouristLocation(String location1, String location2) {
        for (int i = 0; i < touristLocation.length; i++)
            if (touristLocation[i].equals(location1) || touristLocation[i].equals(location2))
                touristLocation[i] = null;
    }

    public void removeTouristLocation(String location1, String location2, String location3) {
        for (int i = 0; i < touristLocation.length; i++)
            if (touristLocation[i].equals(location1) || touristLocation[i].equals(location2) || touristLocation[i].equals(location3))
                touristLocation[i] = null;
    }

    public void removeTouristLocation(String location1, String location2, String location3, String location4) {
        for (int i = 0; i < touristLocation.length; i++)
            if (touristLocation[i].equals(location1) || touristLocation[i].equals(location2) ||
                    touristLocation[i].equals(location3) || touristLocation[i].equals(location4))
                touristLocation[i] = null;
    }

    public void removeTouristLocation(String location1, String location2, String location3, String location4, String location5) {
        for (int i = 0; i < touristLocation.length; i++)
            if (touristLocation[i].equals(location1) || touristLocation[i].equals(location2) || touristLocation[i].equals(location3)
                    || touristLocation[i].equals(location4) || touristLocation[i].equals(location5))
                touristLocation[i] = null;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

}
