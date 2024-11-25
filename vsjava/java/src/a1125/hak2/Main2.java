package a1125.hak2;

public class Main2 {
    public static void main(String[] args) {
        //학생 객체 생성
        Student student1 = new Student("홍길동", 20231234, 90, 85 , 92);

        //학생정보 출력
        System.out.println("이름 : " + student1.getName() );
        System.out.println("학번: " + student1.getStudentId());
        System.out.println("국어: " + student1.getKor());
        System.out.println("수학: " + student1.getMath());
        System.out.println("영어: " + student1.getEng());
        System.out.println("평균: " + student1.getAverage());
        //student1.getAverage(); 2번방법
        Student student2 = new Student();

        student2.setName("아경자");
        student2.setStudentId(20134578);
        student2.setKor(90);
        student2.setEng(85);
        student2.setMath(95);
        
         //학생정보 출력
         System.out.println("이름 : " + student2.getName() );
         System.out.println("학번: " + student2.getStudentId());
         System.out.println("국어: " + student2.getKor());
         System.out.println("수학: " + student2.getMath());
         System.out.println("영어: " + student2.getEng());
         System.out.println("평균: " + student2.getAverage());



    }
}
