package a1112;

import java.util.Scanner;

public class scan8 {
    public static void main(String[] args) {
        //일력 예시  
        //A
        //b
       // 출력 b A
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("a 값 입력: ");
		String a = scanner.next();
				
		System.out.print("b 값 입력: ");
		String b = scanner.next();
        
        System.out.print(b+" "+a);
       
 
    }   
}
