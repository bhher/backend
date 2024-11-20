package a1120;

import java.util.Scanner;

public class Hak_Ex09_1 {
    public static void main(String[] args) {
        boolean run = true;

        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);
        while (run) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------------");
            
            System.out.print("선택>");
            try{
            int selectNo = Integer.parseInt(scanner.nextLine());
            //줄단위로 문자처럼 입력받고 parseInt 숫자로 변환
            if(selectNo == 1){
                System.out.print("학생수>");
                studentNum = Integer.parseInt(scanner.nextLine());
                scores = new int[studentNum];
            }else if(selectNo==2){
                if(scores == null){
                    System.out.println("학생 수를 먼저 입력하세요.");
                   continue; // 메뉴 선택으로 돌아감
                }
                for(int i=0; i < scores.length;i++){
                    System.out.print("scores["+i+"]>");
                    scores[i] = Integer.parseInt(scanner.nextLine());
                }
            }else if(selectNo==3){
                if(scores == null){
                   System.out.println("학생 수를 먼저 입력하세요.");
                   continue; // 메뉴 선택으로 돌아감
                }
                for(int i=0; i < scores.length;i++){
                    System.out.println("scores["+i+"]: " +scores[i] );
                    //scores[0] : 80 scores[1] : 80
                }
            }else if(selectNo==4){
                if(scores == null){
                    System.out.println("학생 수를 먼저 입력하세요.");
                   continue; // 메뉴 선택으로 돌아감
                }
                int max = 0;
                int sum = 0;
                double avg = 0;
                for(int i = 0; i <scores.length;i++){
                    max = (max < scores[i])? scores[i] : max ;
                    sum = sum + scores[i];
                }
                avg = (double) sum / studentNum;
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            }else if(selectNo==5){
                run = false;
            }else{
                System.out.println("유효하지 않은 선택입니다. 다시 시도해주세요");
            }

            }catch(NumberFormatException e) {
                System.out.println("숫자를 입력하세요.");
            }
        }
        System.out.println("프로그램종료");

        //위의 내용을 switch case문으로 변경 작성
    }
}
