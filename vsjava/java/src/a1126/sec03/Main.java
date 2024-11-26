package a1126.sec03;

import a1126.sec03_1.Child;
import a1126.sec03_1.Parent;

class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super();  // 부모 클래스의 생성자를 명시적으로 호출 (자동 호출됨)
        System.out.println("Child constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
