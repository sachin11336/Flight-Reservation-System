package com.company;
public class Ticket {
    public String pnr;
   public String from;
   public String to;
   public Flight flight;
   public String departureDateTime;
   public String arrivalDateTime;
   public Passenger passenger;
   public String seatNo;
   public float price;
   public boolean cancelled;

   public Ticket(String pnr,String from,String to,Flight flight,String departureDateTime,String arrivalDateTime,
                 Passenger passenger,String seatNo,float price,boolean cancelled){
       this.pnr=pnr;
       this.from=from;
       this.to=to;
       this.flight=flight;
       this.departureDateTime=departureDateTime;
       this.arrivalDateTime=arrivalDateTime;
       this.passenger=passenger;
       this.seatNo=seatNo;
       this.price=price;
       this.cancelled=cancelled;
   }

      public String CheckStatus(){
          return CheckStatus;
        }

       public int getFlightDuration(){
       return FlightDuration;
       }

    public void cancel() {

    }
         return cancel;

}
