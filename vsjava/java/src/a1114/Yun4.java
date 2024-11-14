package a1114;

import java.util.Scanner;

public class Yun4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도입력 : ");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0)
            System.out.println("윤년 입니다.");
        else
            System.out.println("윤년이 아닙니다.");
        

    }
}
