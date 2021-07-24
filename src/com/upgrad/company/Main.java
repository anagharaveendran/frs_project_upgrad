package com.upgrad.company;

public class Main {

    public static void main(String[] args) {

        // Checkpoint 2 Starts..............

        Passenger passenger =
                new Passenger("abc_street", "abc_city",
                        "abc_state", "abc_name", "+9190876354", "abc@qwe.com");

        System.out.println(passenger.getAddressDetails());
        System.out.println(passenger.getContactDetails());

        // Checkpoint 2 ends .......

        //Checkpoint 3 starts.........

        Flight flight = new Flight("QWE123","abc_airline",200,112);

        System.out.println(flight.getFlightDetails());

        //Checkpoint 3 ends.....

        //Checkpoint 5 starts..........

        Ticket regularTicket = new RegularTicket(1,"reg-pnr-123","from","to",
                "dep","arr",
                "seat",3000,true,"food");

        Ticket touristTicket = new TouristTicket(2,"tour-pnr-456","from","to","dep","arr",
                "seat",2500,true,"hotel");

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket){
        RegularTicket regularTicket = new RegularTicket();
        System.out.println("PNR NO: "+ticket.getPnr());
    }

    // Checkpoint 5 ends...........
}
