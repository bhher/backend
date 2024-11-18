package a1115;

import java.util.Scanner;

public class Star2 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int n = sc.nextInt();

        // 자연수 N을 입력받아, 삼각형 모양의 "*"을 출력하시오.
		// 입력 : 5
		// 출력
		
        for(int i = 1; i <=n; i++){
            for(int j = n; j >=i; j--){
                System.out.print("*");
            } 
            System.out.println();   // 별을 다섯개찍고 줄바꿈
            // i : 1, j : 5 4 3 2 1
			// i : 2, j : 5 4 3 2
			// i : 3, j : 5 4 3
			// i : 4, j : 5 4
			// i : 5, j : 5
		
        }

   }
   


}
