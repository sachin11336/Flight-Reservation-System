package com.company;

public class TouristTicket extends Ticket{

  public String hotelAddress;
  public  String selectedTouristLocation[] selectedTouristLocation;

  public TouristTicket(String pnr,String from,String to,Flight flight,String departureDateTime,String arrivalDateTime,
                       Passenger passenger,String seatNo,float price,boolean cancelled) {


    super(pnr, from, to, flight, departureDateTime, arrivalDateTime,
            passenger, seatNo, price, cancelled);
  }