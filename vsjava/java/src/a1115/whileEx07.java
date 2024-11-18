package a1115;

import java.util.Scanner;

public class whileEx07 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;
        Scanner sc = new Scanner(System.in);
        //int money = 0;
        while(run){
            // System.out.println("1.예금2.출금3.잔고4.종료");
            System.out.println("==================================");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("==================================");
            System.out.print("선택>");
            //sc 입력변수 menuNum
            int menuNum = Integer.parseInt(sc.nextLine()); //혹시문자로 인식해도 숫자로변환

              //switch(menuNum)
            switch (menuNum) {
                case 1:
                    System.out.print("예금액>");
                   // money = Integer.parseInt(sc.nextLine());
                    //balance = balance + money;
                    balance += Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.print("출금액>");
                    balance -= Integer.parseInt(sc.nextLine());
                    break;
                case 3:
                    System.out.print("잔고>");    
                    System.out.println(balance);
                    break;
                case 4:
                    run = false;     
                    break;   
                default:
                    System.out.println("잘못입력했습니다. 다시입력해주세요");
                    break;
            }
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
