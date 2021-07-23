package com.upgrad.company;

public class Ticket {

    private int id;
    private String pnr;
    private String from;
    private String to;
    private String departureDatTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean cancelled;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDatTime() {
        return departureDatTime;
    }

    public void setDepartureDatTime(String departureDatTime) {
        this.departureDatTime = departureDatTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
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