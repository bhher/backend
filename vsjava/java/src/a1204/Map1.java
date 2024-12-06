package a1204;

import java.util.HashMap;
import java.util.Map;

class Student{
   
    private int id;
    private String name;
    private int age;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

}
public class Map1 {
    public static void main(String[] args) {
        
    //Map 생성
    Map<Integer, Student> studentMap = new HashMap<>(); 
    
    // 객체 추가
    studentMap.put(1, new Student(101, "Alice", 20));
    studentMap.put(2, new Student(102, "Bob", 22));
    studentMap.put(3, new Student(103, "Charlie", 21));
    //Map내용 출력
    System.out.println("Student Map 출력");
    for(Map.Entry<Integer, Student> entry : studentMap.entrySet()){
        System.out.println("key: "+ entry.getKey() + ". Value:"+ entry.getValue());
    }    
    //특정키로 객체를 가져오기
    System.out.println("\n특정 키(2)의 Student 정보:");
    Student student = studentMap.get(2);
    System.out.println(student);

    //모든 Student 이름 출력
    System.out.println("\n모든 학생의 이름 출력:");
    for (Student s : studentMap.values()) {
        System.out.println(s.getName());
    }

    //Map 학생한명을 추가하는 데이터 추가
    addStudent(studentMap, 4, 104,"John",27);
    printMap(studentMap);    
     
    //학생 업데이트
    System.out.println("\n 특정키 (1)의 Student 정보 수정");
    updateStudent(studentMap,1,"성철", 21);
    printMap(studentMap);    
    
    //학생한명 보여주기 key(2)
    System.out.println("\n 특정키 (2)의 Student 정보 읽기");
    Student s = readStudent(studentMap,2);
    System.out.println(s != null? s : "찾는 학생이 없어요");
    
    
        //학생삭제
        System.out.println("\n 특정키 (1)의 Student 정보 삭제");
        deleteStudent(studentMap,1);
        printMap(studentMap);    
        
        
        
             }
    
             
        private static Student  readStudent(Map<Integer,Student> studentMap, int key) {
            // if( studentMap.containsKey(key)){
            //     return studentMap.get(key);
            //   }
            // return null; //key 없으면 null 반환 
            return studentMap.getOrDefault(key, null);
            //자바 8이상 
            //getOrDefault(K key, V defaultValue) 
            //주어진 키 key 에 대응하는 값있으면 그값을반환
            // 키에 대응하는 값이 없으면 defaultValue를 반환. - null
        }
    
    
            private static void deleteStudent(Map<Integer, Student> studentMap, int key) {
           if( studentMap.containsKey(key)){
             Student removedStudent = studentMap.remove(key);
             System.out.println("학생 삭제" + removedStudent); // 삭제된 학생을 출력
           }else{
             System.out.println("학생을 찾을 수가 없습니다.");
           }

        
        }
                private static void updateStudent(Map<Integer,Student> studentMap, int key, String newName, int newAge) {
                Student student = studentMap.get(key);
                if(student != null){
                    student.setName(newName);
                    student.setAge(newAge);
                    System.out.println("학생 정보 수정: " + student);
                }else{
                    System.out.println("학생을 찾을 수가 없어요");
                }
       
            }
            private static void printMap(Map<Integer,Student> studentMap) {
            System.out.println("Student Map 출력");
            for(Map.Entry<Integer, Student> entry : studentMap.entrySet()){
                System.out.println("key: "+ entry.getKey() + ". Value:"+ entry.getValue());
            }    
        }
        private static void addStudent(Map<Integer,Student> studentMap, int key,int id,String name, int age ) {
            Student student = new Student(id, name, age);
            studentMap.put(key, student);
        
        } 

 }