package a1125.Person1;

public class Person {
    private static int count;
   
    public static int getCount() {
        return count;
    }

    //전체 사람 수를 저장하는 정적변수
    private String name; //변수,필드,인스턴스변수
    private int age;
   
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++; //새로운 사람이 생성될때 마다 총 인원수 증가
    }

    // public static int getTotalCount() {
    //    return count;
    // }

}
//정적변수 (static 변수) - 클래스변수
//정적변수는 클래스에 속하고, 객체를 생성하지 않고도
//클래스 이름으로 직접접근 할 수 있는 변수 즉, 클래스의 모든
//객체가 공유하는 하나의 값을 가집니다.

//정적 메서등(static);
//정적 메서드는 클래스에 속하며, 객체를 생성하지 않고도
//클래스 이름으로 직접접근 할 수 있는 메소드는 인스턴스변수에
//접근할 수 없으며, 오직 정적변수나 다른 정적 메서드만 호출 
// 할 수 있다. 