package a1115;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        //무한 루프
        //: 반드시 종료 조건을 추가해주어야한다.(break)
        while (true) {
            System.out.print("입력 :" );
            String str = sc.nextLine();         
            //문자열.equal("비교문자열")
            //문자열이 비교문자열과 일치하는지 여부를 알려주는 메소드

            if(str.equals("q")){
                break;
            }
            System.out.println("입력받은 문자 :"+ str);

        }
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }
}
