package a1113;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //정수 세 개를 입력받아 합과 평균을 출력하시오
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 숫자 입력: ");
        int num2 = scanner.nextInt();       
        System.out.print("세번째 숫자 입력: ");
        int num3 = scanner.nextInt();
        int sum = num1 + num2 + num3;
        //double avg = (double)sum / 3;

        System.out.println("총합 : "+ sum);
        System.out.printf("평균 : %.1f\n", (float)sum/3);


      
        
    }
}
