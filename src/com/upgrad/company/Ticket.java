package com.upgrad.company;

public class Ticket {

    public int id;
    public String pnr;
    public String from;
    public String to;
    public String departureDatTime;
    public String arrivalDateTime;
    public String seatNo;
    public float price;
    public boolean cancelled;

    public Ticket(int id,String pnr,String from,String to,String departureDatTime,
                  String arrivalDateTime,String seatNo,float price,
                  boolean cancelled){
        this.id = id;
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDatTime = departureDatTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;

    }

    public String checkStatus() {
        String str;
        if (cancelled == true) {
            str = "Ticket available";
        } else {
            str = "Ticket is not available";
        }
        return str;

    }
    public String getFlightDuration(){
        String str ="departTime + ArrivTime";
        return str;
    }
    public void cancelTicket(){
        this.cancelled = false;
    }
}