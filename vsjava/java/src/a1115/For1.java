package a1115;

public class For1 {
    public static void main(String[] args) {
        //for(int 1초기식;2조건식;3증감식 ){ 4실행문}
        //실행순서 : 1 ->반복(2 -> 3 ->4)

        //1. 1~ 10까지 정수를 출력하시오
        for(int i = 1; i <=10; i++){
            System.out.print(i + " ");
        }
        // 2. 50~100 까지의 정수를 출력하시오.
        for(int i = 50; i <=100; i++){
            System.out.print(i + " ");
        }
        // 3. 1~20 까지의 정수 중 , 짝수만 출력하시오.
		// 2 4 6 .. 20
        for(int i = 2; i <= 20; i +=2){
            System.out.print(i + " ");
        }
        System.out.println();
        // 4. 10~20 까지의 정수 중 , 홀수만 출력하시오.
        for(int i = 11; i <= 20; i +=2){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
