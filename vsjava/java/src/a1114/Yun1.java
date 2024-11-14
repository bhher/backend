package a1114;

import java.util.Scanner;

public class Yun1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("연도입력 : ");
         int a = sc.nextInt();
         if(a % 4 == 0){
            if(a %400 != 0 && a%100 == 0 ){ // 2100
                System.out.println("윤년이 아닙니다.");
            }else{
                System.out.println("윤년입니다.");
            }
         }else{
            System.out.println("유년이 아닙니다.");
         }

    }
}
