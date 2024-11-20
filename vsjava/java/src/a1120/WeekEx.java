package a1120;

import java.util.Calendar;

public class WeekEx {
    public static void main(String[] args) {
        //Week 열거 타입 변수 선언
        Week today = null;

        //Calender 얻기
        Calendar cal = Calendar.getInstance();

        //오늘의 요일 얻기(1~7) 일:1, 월:2,화:3,
        int week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);
        //숫자를 열거 상수로 변환해서 변수에 대입

        switch(week){
            case 1: today = Week.SUNDAY ; break;
            case 2:  today = Week.MONDAY;       	break;
			case 3:  today = Week.TUESDAY;       	break;
			case 4:  today = Week.WEDNESDAY; 	break;
			case 5:  today = Week.THURSDAY;   	break;
			case 6:  today = Week.FRIDAY;         	break;				
			case 7:  today = Week.SATURDAY;   	break;	
        }
        //열거  타입 변수를 사용
        if(today == Week.SUNDAY){
            System.out.println("일요일엔 축구");
        }else{
            System.out.println("열심히 자바 공부 합니다.");
        }
    }
}
