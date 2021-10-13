package com.company;

import java.text.ParseException;

public class Main {
        public static void main(String[] args) throws ParseException{
            Flight flight1 = new Flight(56789,"Mat Black", "Indigo Air", 450, "19/Nov/2021",
                    "20/Nov/2021", "08:45:00", "11:30:00");
            Flight flight2 = new Flight(12345,"Fast Furious", "Spice Jet", 250, "19/Oct/2021",
                    "20/Oct/2021", "13:25:00", "19:45:00");
            Passenger passenger1 = new Passenger("Prince", 963852741, "asdfghy@gmail.com",
                    "Taj Colony", "Agra", "U.P");
            Passenger passenger2 = new Passenger("Ram", 125478963, "qwerytib@gmail.com",
                    "Defence Colony", "Pune", "Maharashtra");
            String[] touristLocation = {"Taj Mahal", "Agra Fort", "Fatehpur Sikri", "Itmad-Ud-Daulah’s Tomb", "Akbar’s Tomb"};
            TouristTicket ticket1 = new TouristTicket(4656456457L, "Sri Guru Ram Dass Jee International Airport",
                    "Chennai International Airport", true, flight1, passenger1, "Agra",
                    touristLocation, 15000);
            RegularTicket ticket2 = new RegularTicket(7812335465L, "London", "Boston",
                    true, flight2, passenger2, true,30000);

            System.out.println("Flight 1:");
            System.out.println(flight1.getFlightName());
            System.out.println(" ");
            System.out.println(passenger1.getContactDetails());
            System.out.println(" ");
            System.out.println(passenger2.getAddressDetails());
            System.out.println(" ");
            System.out.println(ticket1.durationOfJourney());
            System.out.println(" ");
            System.out.println(ticket2.durationOfJourney());
            System.out.println(" ");
            System.out.println(flight1.getFlightDetails());
            System.out.println(" ");
//            System.out.println(ticket1.updateTouristLocation(touristLocation));
            System.out.println(ticket2.pnrNumber);
            System.out.println(" ");
            printTicketDetails(ticket1);
            System.out.println(" ");
            printTicketDetails(ticket2);
        }

        public static void printTicketDetails(Ticket ticket) {
            System.out.println(ticket.pnrNumber);
        }
    }
