package a1113;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원하는 단을 입력하세요: ");
        int dan = scanner.nextInt();
               
        for(int i = 1; i <=9;i++){
           System.out.println(dan + " X " + i + " = " + (dan*i));
        }
        
    }
}
