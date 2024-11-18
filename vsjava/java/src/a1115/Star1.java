package a1115;

import java.util.Scanner;

public class Star1 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int n = sc.nextInt();

        // 자연수 N을 입력받아, 삼각형 모양의 "*"을 출력하시오.
		// 입력 : 5
		// 출력
		// *
		// **
		// ***
		// ****
		// *****
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            } 
            System.out.println();   // 별을 다섯개찍고 줄바꿈
        }

   }
   


}
