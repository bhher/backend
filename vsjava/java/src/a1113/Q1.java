package a1113;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        System.out.print("두번째 정부를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 +" + "+ num2 + " = " + (num1+num2));
        System.out.println(num1 +" - "+ num2 + " = " + (num1-num2));
        System.out.println(num1 +" * "+ num2 + " = " + (num1*num2));
        System.out.println(num1 +" / "+ num2 + " = " + (num1/num2));
        System.out.println(num1 +" % "+ num2 + " = " + (num1%num2));

        System.out.printf("%d + %d = %d\n",num1, num2, (num1+num2));
        System.out.printf("%d - %d = %d%n", num1, num2, (num1 - num2));
        System.out.printf("%d * %d = %d%n", num1, num2, (num1 * num2));
        System.out.printf("%d / %d = %d%n", num1, num2, (num1 / num2));
        System.out.printf("%d %% %d = %d%n", num1, num2, (num1 % num2));
        //System.out.printf("%d\n", (num1+num2));
    }
}
