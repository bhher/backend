package a0812.javaair;

import java.time.LocalDate;
import java.time.Period;

public class Passenger { //예매자 정보 저장 - 나이검증 여기서
    private String  name;
    private int birthDate; //생년월일 831016
    private String pw; //예약 비밀 번호
    private String seat; // 좌석
    public Passenger(String name, int birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public Passenger(String name, int birthDate, String pw) {
        this.name = name;
        this.birthDate = birthDate;
        this.pw = pw;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   
    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
    public String getSeat() {
        return seat;
    }
    public void setSeat(String seat) {
        this.seat = seat;
    }
    
    public boolean man15 (Passenger p){//831016
        int y = p.birthDate/10000;// 83.1016 -> 83
        int m = (p.birthDate%10000)/100;
        //831016 10000 나머지 1016 /100 -> 10
        int d = p.birthDate%100; // 나머지 16
        if(y >= 0 && y <=24){
            y = y + 2000;
        }else{
            y += 1900;
        }
        LocalDate birthDate2 = LocalDate.of(y,m,d); //생년월일
        LocalDate currentDate = LocalDate.now(); //오늘 년월일
        int age = Period.between(birthDate2, currentDate).getYears();
        // Period.between(birthDate2, currentDate) 두날짜간의 차이
        return age >= 15; //나이가 15세 이상 true 아니면 false
    }

}
