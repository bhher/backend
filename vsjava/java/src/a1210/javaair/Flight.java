package a1210.javaair;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Flight {
    //목적지, 비행시간, 금액
    private String destination;
    
    private String time;
    private int price;
    private DecimalFormat priceFormat =new DecimalFormat("#,###원");
    //120000 -> 1,200,000원
    private Boolean internationalFlight; //국제선
    private ArrayList<String> seats;//촤석

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public DecimalFormat getPriceFormat() {
        return priceFormat;
    }

    public void setPriceFormat(DecimalFormat priceFormat) {
        this.priceFormat = priceFormat;
    }

    public Boolean getInternationalFlight() {
        return internationalFlight;
    }

    public void setInternationalFlight(Boolean internationalFlight) {
        this.internationalFlight = internationalFlight;
    }

    public ArrayList<String> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<String> seats) {
        this.seats = seats;
    }

    public Flight(String destination, String time, int price, Boolean internationalFlight) {
        this.destination = destination;
        this.time = time;
        this.price = price;
        this.internationalFlight = internationalFlight;
        seats = new ArrayList<>();
        for(int i=1; i<=20; i++){
            seats.add(i+"");//숫자를 문자열로 넣기
        }
    }

    @Override
    public String toString() {
        String priceComma = priceFormat.format(price);
        return " ."+"목적지 : " + destination + ", 출발시간" + time + ", 가격: " + priceComma;
    }

    public void seatToString(){
        for (int i = 0; i < seats.size()-3; i += 4) {
            System.out.printf("|  [%2s]\t\t[%2s][%2s] \t [%2s]  |\n",seats.get(i),seats.get(i+1),seats.get(i+2),seats.get(i+3));
        }
    }
    //[1][2][3][4]
    //[5][6][7][8]
    //[9][10][11][12]
     //[13][14][15][16]

    


}
