package a1118;

import java.util.Scanner;

public class Marray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int [3][3];
        for(int i = 0; i < scores.length;i++){
            System.out.printf("학생%d의 국어,영어,수학 점수를 입력하세요 : " , i+1);
            for(int j=0; j < scores[i].length;j++){
                scores[i][j] = sc.nextInt();
                //totalSum = totalSum + scores[i][j] ; 
            }
        } 

        //각학생의 총점과 평균 계산
        for(int i = 0;  i < scores.length;i++){
            int sum = 0;
            for(int j =0; j < scores[i].length; j++){
                sum = sum + scores[i][j];
            }
           double avg = (double) sum / scores[i].length;
           System.out.printf("학생%d의 총점, %d, 평균: %.2f\n",i+1, sum, avg);
        }
        int totalSum =0;
        int totalSub = 0;
        //숙제 전체 총점 전체 평균 을 구하시오  
        for(int i = 0; i < scores.length;i++){
            //totalSub = totalSub + scores[i].length;
            for(int j=0; j < scores[i].length;j++){
                totalSum = totalSum + scores[i][j] ; 
            }
        } 
        totalSub = scores.length* scores[0].length;//과목의 열의 갯수와 행의 갯수
        System.out.println("총과목" +  totalSub);
        double totalAvg = (double)totalSum /  totalSub;
        System.out.printf("전체총점: %d, 전체평균: %.2f\n",totalSum, totalAvg );
    }
}
