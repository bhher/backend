package a1115;

public class WhileSum {
    // 1~100까지 합계를 구하시오
    // 합계 : 5050
   public static void main(String[] args) {
    int a = 1;
    int sum = 0; 
    //while( 조건 ){ 반복 실행문 }
    while(a<=100){
       
    //    sum = sum + a;
    //    a++;
        sum = sum + a++;
    }
    System.out.println("합계 : " + sum);
   }

}
