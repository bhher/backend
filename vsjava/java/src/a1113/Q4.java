package a1113;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = scanner.nextInt();
        int sum = 0;
        
        for(int i = 1; i <=num;i++){
           // System.out.print(i+" ");
           sum += i; //sum = sum + i;
         //  System.out.println("1부터100 합계 : "+ sum);
        }
        System.out.println("1부터"+num+" 합계 : "+ sum);
    }
}
