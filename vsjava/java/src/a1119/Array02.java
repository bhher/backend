package a1119;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {
        String[] week = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};

        for(int i = 0; i < week.length; i++){
            System.out.print(week[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(week));
        System.out.println();

        // 
        //foreach : ctrl + space 
        //foreach 문 
        //배열 또는 컬렉션의 모든 요소를 순서대로 반복하는 반복문 
        for (String day : week) {
            System.out.print(day + " " ); //day : week[i]
        }

        
    }
}
