package a1122;

public class StudentTest {
    public static void main(String[] args) {
        Student park = new Student(2019122104,"Park" );
        Student kim = new Student(2019122107,"KIm" );
        Student lee = new Student(2019122109,"Lee" );
        System.out.printf("Student 객체의 수 : %d", Student.count);
    }
}
class Student{
    //클래스(static)변수
   static int count = 0; 
   //인스턴스 변수
   int id;
   String name;

public Student(int id, String name) {
    Student.count++;
    this.id = id;
    this.name = name;
}

}
