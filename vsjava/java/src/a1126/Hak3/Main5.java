package a1126.Hak3;

//모든 자바 클래스는 Object 라는 클래스를 상속 한다. 보통은  Object 생략
public class Main5 extends Object {
    public static void main(String[] args) {
        Person person = new Person("홍길동", 25);
       // System.out.println(person.toString());
       System.out.println(person);
 // 객체 person ->  person.toString() 생략된형태
 //  toString() 는 Object 에서 상속 받은 메서드 , 객체의 문자열 표현을 정의하는 메서드

        //getter setter가 없어 출력할 방법이 없다.
        //System.out.println(person.toStr());
            }
   }
        class Person {
            

            private String name;
            private int age;
            
            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
        
            // public String toStr() {
            //     return String.format("이름: %s,  나이: %d", name, age);
            // }
            @Override
            public String toString() {
                return "Person [name=" + name + ", age=" + age + "]";
            }
            //toString()을 오버라이드하면 객체정보를 사람이 읽을 수 있는 형태로 출력할 수 
            //있어 디버깅 , 로깅, 출력 등에 매우 유용합니다.
}

