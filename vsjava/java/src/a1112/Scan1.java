package a1112;

import java.util.Scanner;

public class Scan1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        //Scanner 객체생성 System.in(콘솔)에서 입력받는다.
        int num = scaner.nextInt();
        System.out.println(num);
    }
}
