package a1121.anC2;

public class StudentEx {
    public static void main(String[] args) {
        //Student 객체 생성
        Student student = new Student();
        student.name = "유영수";
        student.age = 31;
        student.stdNo = "2013000000";
        student.major = "컴퓨터시스템공학과";
 

        Student student2 = new Student("김승현", 20, "20230002", "전자공학");
        int[] score = {10,20,30,40,50};
        int[] score2 = {20,80,100,30,40};	// 학생2의 성적
        System.out.println("##### 학생1 #####");
		System.out.println("학생1 - 이름 : " + student.name);
		System.out.println("학생1 - 나이 : " + student.age);
		System.out.println("학생1 - 학번 : " + student.stdNo);
		System.out.println("학생1 - 전공 : " + student.major);
        student.study("Java");
        System.out.println("학생1 - 중간고사 점수 : " + student.getAverage(10, 20));
        System.out.println("학생1 - 기말고사 점수 : " + student.getAverage(30,40,50));
        System.out.println("학생1 - 최종점수 점수 : " + student.getAverage(score));

        System.out.println("##### 학생2 #####");
		System.out.println("학생2 - 이름 : " + student2.name);
		System.out.println("학생2 - 나이 : " + student2.age);
		System.out.println("학생2 - 학번 : " + student2.stdNo);
		System.out.println("학생2 - 전공 : " + student2.major);
        student.study("Java");
        System.out.println("학생2 - 중간고사 점수 : " + student2.getAverage(20,80));
        System.out.println("학생2 - 기말고사 점수 : " + student2.getAverage(100,30,40));
        System.out.println("학생2 - 최종점수 점수 : " + student2.getAverage(score2));


    }
}
