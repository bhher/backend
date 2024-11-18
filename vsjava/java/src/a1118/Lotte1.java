package a1118;

import java.util.Arrays;

public class Lotte1 {
    public static void main(String[] args) {
        int[] ball = new int[45];
        for(int i=0;i < ball.length;i++){
            ball[i] =i+1; 
        }
       // System.out.println(Arrays.toString(ball));
int n =0;
int tmp = 0;
       for(int i=0; i < 1000; i++ ){
          n = (int)(Math.random() * 45); 
          tmp = ball[0];
          ball[0] = ball[n];
          ball[n] = tmp; 
       }
       System.out.println(Arrays.toString(ball));
       for(int i=0; i < 6;i++){
         System.out.printf("ball[%d]=%d\n",i, ball[i]);
       } 

    }
}
// 140page 자바에 정석에서 로또 프로그램 이해하고 오기
