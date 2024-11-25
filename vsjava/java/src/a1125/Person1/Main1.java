package a1125.Person1;

public class Main1 {
    public static void main(String[] args) {
        Person person1 = new Person("홍길동", 20);
        Person person2 = new Person("김철수", 30);
        Person person3 = new Person("박영희", 25);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        //System.out.println(Person.count);
        //System.out.println(Person.getTotalCount());
        System.out.println(Person.getCount());
       // System.out.println(person1.getCount());
    }
}
