package a1209.ArrayList1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx {
    public static void main(String[] args) {
       //student 를 담을수 있는 ArrayList  students를 만드시오
       ArrayList<Student> students = new ArrayList<>();     
    //    Student s1 = new Student("Alice", 20, "S001");
    //    Student s2 = new Student("Bob", 22, "S002");
    //    Student s3 = new Student("Charlie", 19, "S003");

    //    students.add(s1);  
    //    students.add(s2);  
    //    students.add(s3); 
    
    // Adding dummy data
    students.add(new Student("Alice", 20, "S001"));
    students.add(new Student("Bob", 22, "S002"));
    students.add(new Student("Charlie", 19, "S003"));

    Student s4 = new Student();

    s4.setName("Tom");
    s4.setAge(22);
    s4.setStudentId("S004");
    students.add(s4);
    boolean run = true;    
    Scanner scanner = new Scanner(System.in);
    while (run) {
        System.out.println("----학생관리프로그램-----");
        System.out.println("1.학생추가하기");
        System.out.println("2.학생리스트보여주기");
        System.out.println("3.학생수정");
        System.out.println("4.학생삭제");
        System.out.println("5.Exit");
        System.out.print("선택해주세요>>");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        switch (choice) {
            case 1:
                //학생을 입력받아 넣고 리스트에 추가하는 내용을 작성하세요
                System.out.print("이름을 넣으세요>>");
                String n = scanner.nextLine();
                System.out.print("나이를 입력하세요>>");
                int a = scanner.nextInt(); //숫자입력할때  20 \n(개행문자)
                scanner.nextLine(); // next()나 nextInt() 같은 메서드가 입력버퍼에 남긴 \n 제거
                System.out.print("아이디를 입력하세요>>");
                String id = scanner.nextLine();
                students.add(new Student(n,a,id));
                System.out.println("학생 추가 성공");
                // Student s5 = new Student();
                // System.out.print("이름을 넣으세요>>");
                // s5.setName(scanner.nextLine());
                // System.out.print("나이를 입력하세요>>");
                // s5.setAge(scanner.nextInt());
                // System.out.print("아이디를 입력하세요>>");
                // s5.setStudentId(scanner.nextLine());
                // students.add(s5);
                // System.out.println("학생 추가 성공");
                break;
            case 2:
                //학생리스트보여줏기
                if(students.isEmpty()){//학생리스트가 없으면
                    System.out.println("보여줄 학생 리스트없음");
                }else{
                    for(Student student: students){
                        System.out.println(student);
                    }
                }
                break; //현재의 반복문만 빠져나간다.
            case 3:
                System.out.println("업데이트할 학생 id 를 입력해주세요");
                String updateId = scanner.nextLine();
                boolean found = false;
                for(Student student: students){
                    if(student.getStudentId().equalsIgnoreCase(updateId)){
                        System.out.print("새로운 이름: ");
                        student.setName(scanner.nextLine());
                        System.out.print("새로운 나이: ");
                        student.setAge(scanner.nextInt());
                        scanner.nextLine(); // Consume newline
                        System.out.println("학생 수정 성공");
                        found = true;
                        break;
                    }
                }
                if(!found){
                    System.out.println("찾는 학생이 없습니다.");
                }
                break;
            case 4:
                //학생 삭제
                System.out.println("삭제할 학생 id를 입력해 주세요");
                String deleteId =  scanner.nextLine();
                found = false;
                for(Student student: students){
                    if(student.getStudentId().equalsIgnoreCase(deleteId)){
                        students.remove(student); //리스트에서 학생한줄 삭제
                        System.out.println("학생을 삭제했습니다.");
                        found = true;
                        break;
                    }
                }
                if(!found){
                    System.out.println("찾는 학생이 없습니다.");
                }
                break;
            case 5: 
                //Exit
                System.out.println("프로그램을 끝냅니다.");
                scanner.close();
                //System.exit(0);
                //return; //현재메서드 (main) 전체를 종료, 호출된 곳으로 제어를 반환   
                run = false;
                break; 
            default:
               System.out.println("잘못 입력했습니다. 다시 입력해 주세요");
        }

    }  


    }
}
