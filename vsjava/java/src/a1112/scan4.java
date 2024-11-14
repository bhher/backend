package a1112;

import java.util.Scanner;

public class scan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y : " + result);
 
        while(true){
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            if(data.equals("q")){
                break;
            }
            System.out.println("출력문자열 :" + data);
            System.out.println();
        }
        System.out.println("종료");
    }
}
