package a1126.Hak5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //사용자로 부터 학생정보 입력하기
        System.out.print("학생 이름을 입력하세요 ");
        String name = scanner.nextLine();
        System.out.print("학생의 학번을 입력하세요: ");
        String studentId = scanner.nextLine();
        System.out.println("학생 성적을 입력하세요 : ");
        int score = scanner.nextInt(0);

        //Grade 객체 생성
        Grade grade = new Grade(name, studentId, score);

        //toString 메서드를 통해 학생 정보 및 성적 출력
        System.out.println(grade.toString());

        scanner.close();

    }
}
