package com.company;

public class RegularTicket extends Ticket {
    public boolean specialService;
    public boolean checkSpecialServices(){
        return specialService;
    }

    public boolean updateSpecialService(boolean specialSevice){
        specialSevice=!specialSevice;
        return specialSevice;
    }

    public RegularTicket(long pnrNumber, String departureLoc, String destinationLoc,
                         boolean confirmed, Flight flight, Passenger passenger,boolean specialService,int price) {
        super(pnrNumber, departureLoc, destinationLoc, confirmed, flight, passenger, price);
    }
}
