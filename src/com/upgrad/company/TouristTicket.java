package com.upgrad.company;

public class TouristTicket extends Ticket{

    private String hotelAddress;
    private String[] selectedTouristLocation =new String[5] ;

    public TouristTicket(int id,String pnr,String from,String to,String departureDateTime,
    String arrivalDateTime,String seatNo,float price,boolean cancelled,String hotelAddress){
        super(id,pnr,from,to,departureDateTime,arrivalDateTime,seatNo,price,cancelled);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = new String[5];
    }

    public TouristTicket() {

    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
}
