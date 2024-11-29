package a1129.Hak4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //학생 정보 입력
        System.out.println("학생 수를 입력하세요 : ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); //개행문자 소비
        for(int i=0; i < numberOfStudents;i++){
            System.out.println("학생 이름 : ");
            String name = scanner.nextLine();
            System.out.println("학생 나이:");
            int age = scanner.nextInt();
            System.out.println("학생 학번:");
            int studentId = scanner.nextInt();
            scanner.nextLine();  // 개행 문자 소비

            students.add(new Student(name, age, studentId));
         

        }
        //정렬 옵션 선택
        System.out.println("정렬 기준을 선택하세요");
        System.out.println("1. 이름");  
        System.out.println("2. 나이");  
        System.out.println("3. 학번");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                //이름을 기준으로 정렬
                Collections.sort(students, new NameComparator());
                break;
            case 2:
                //이름을 기준으로 정렬
                Collections.sort(students, new AgeComparator());
                break;
            case 3:
                //이름을 기준으로 정렬
                Collections.sort(students, new StudentIdComparator());
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                return;
        }


            
            //정렬된 결과 출력
            System.out.println("정렬된 학생 목록");
            for(Student student : students){
                System.out.println(student);
            }

    }
   
   

   
}

class Student {
    private String name;
    private int age;
    private int studentId;
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    public Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }
   

//student 클래스는 'camparable' 구현하진 않습니다. 
//대신 Comparator를 사용하여 다양한 정렬을 제공
//Comparator 클래스들
//NameComparator, AgeComparator, StudentIdComparator 클래스를 추가 
//각각 이름, 나이 ,학번을 기준으로 정렬

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
    }
}

   
 //이름을 기준으로 정렬하는 Comparator
 class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class StudentIdComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getStudentId(), o2.getStudentId());
    }
}   