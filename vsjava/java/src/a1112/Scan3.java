package a1112;

import java.util.Scanner;

public class Scan3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("이름입력 : ");
        String name = scan.nextLine();  //문자열입력
        System.out.print("나이입력 :"); //줄바뀜없음
        int age = scan.nextInt(); //나이입력받음

        System.out.println("Name :" + name);
        System.out.println("Age: " + age);
    }
}
