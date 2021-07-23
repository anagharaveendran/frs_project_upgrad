package com.upgrad.company;

public class Flight {
    public String flightNumber;
    public String airline;
    public int capacity;
    public int bookedSeats;

    public Flight(String flightNumber,String airline,int capacity,int bookedSeats){
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }
    public String getFlightDetails(){

        String str ="Flight number:"+this.flightNumber+
                ",Airline:"+this.airline+ ",No of seats:"+this.capacity+",Booked seats:"
                +this.bookedSeats;
        return str;

    }
    public boolean checkAvailability(){
        if(capacity==bookedSeats){
            return false;
        }else {
            return true;
        }
    }


}
