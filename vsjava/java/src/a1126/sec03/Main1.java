package a1126.sec03;

class Parent {
    Parent(String name) {
        System.out.println("Parent constructor with name"+ name);
    }
}
class Child extends Parent {
    Child() {
        super("John");  // 부모 클래스의 생성자를 명시적으로 호출 (자동 호출됨)
        System.out.println("Child constructor");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
