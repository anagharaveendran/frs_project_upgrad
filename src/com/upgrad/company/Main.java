package com.upgrad.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*

       // Checkpoint 2 Starts..............


        Passenger passenger =
                new Passenger("abc_street", "abc_city",
                        "abc_state", "abc_name", "+9190876354", "abc@qwe.com");

        System.out.println(passenger.getAddressDetails());
        System.out.println(passenger.getContactDetails());

        Ticket ticket = new Ticket(12,"12qw345","abc","qwe",
                "24-07-21:10:10","24-07-21:09:10","12A",2300,false);

        System.out.println(ticket.checkStatus());
        System.out.println(ticket.getFlightDuration());

        Flight flight = new Flight("ABC1","abc_airline",100,56);

        System.out.println(flight.getFlightDetails());
        System.out.println(flight.checkAvailability());

        RegularTicket regularTicket = new RegularTicket("Providing food,water and some snacks");

        System.out.println(regularTicket.getSpecialServices());

        TouristTicket touristTicket = new TouristTicket("abc_hotel");
        System.out.println(touristTicket.getHotelAddress());

       // Checkpoint 2 ends................

         */

        Flight flight = new Flight("QWE123","abc_airline",200,112);

        System.out.println(flight.getFlightDetails());

    }
}
