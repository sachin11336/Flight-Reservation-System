package com.company;

public class RegularTicket extends Ticket {
    public String specialServices;

    public RegularTicket(String pnr, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime,
                         Passenger passenger, String seatNo, float price, boolean cancelled) {

        super(pnr, from, to, flight, departureDateTime, arrivalDateTime,
                passenger, seatNo, price, cancelled);
    }

    public String getSpecialServices() {
        return SpecialServices;
    }
}