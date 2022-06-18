package com.company;

public class Main {

    public static void main(String[] args){
            Flight Airline =
                    new Flight("1234", "AirIndia",
                            200, 150);

            TouristTicket customer =
                    new TouristTicket("243463", "Bengaluru",
                            "Karnataka", "345",
                            "8.30", "10.30", 50,"b4",9000f,true);

        RegularTicket confirm =
                new RegularTicket("5676", "Delhi",
                        "Mumbai", "456",
                        "7.30", "10.30", 50,"c4",7000f,true);

        }
    }


