package com.upgrad.company;

public class RegularTicket extends Ticket { // Inherited from ticket
    private String specialServices;


    public RegularTicket(int id,String pnr,String from,String to,String departureDateTime,
                         String arrivalDateTime,String seatNo,float price,boolean cancelled,
                         String specialServices){
        super(id,pnr,from,to,departureDateTime,arrivalDateTime,seatNo,price,cancelled);
        this.specialServices = specialServices;
    }

    public RegularTicket() {

    }



    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

    public void updateSpecialServices(String newService){
        this.specialServices = newService;
    }
}
