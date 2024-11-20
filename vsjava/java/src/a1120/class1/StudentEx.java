package a1120.class1;

public class StudentEx {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "홍길동";
        st1.age = 30;
        st1.studentId = "20201024";
        Student st2 = new Student();
        st2.name = "이말자";
        st2.age = 35;
        st2.studentId = "20201127";
        System.out.println("st1을 소개합니다.");
        //s1의 필드값읽기
        System.out.println("이름 : " + st1.name);
        System.out.println("나이 : " + st1.age);
        System.out.println("학번 : " + st1.studentId);
        System.out.println("st2을 소개합니다.");
        //s1의 필드값읽기
        System.out.println("이름 : " + st2.name);
        System.out.println("나이 : " + st2.age);
        System.out.println("학번 : " + st2.studentId);

    }
}
