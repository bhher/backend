package a1114;

import java.util.Scanner;

public class Max1 {
    public static void main(String[] args) {
//   세 개의 정수를 입력받아, 그 중에서 가장 큰 숫자를 출력하는 프로그램을 작성하세요.

// 출력 예시: "가장 큰 숫자는 X입니다."
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째숫자를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째숫자를 입력하세요: ");
        int num2 = scanner.nextInt();
        System.out.print("세번째숫자를 입력하세요: ");
        int num3 = scanner.nextInt();
        
        int max = num1;

        if(num2 > max){
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }

        System.out.println("가장 큰 숫자는 " + max + "입니다.");

 

    }
}
