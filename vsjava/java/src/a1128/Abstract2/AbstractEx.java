package a1128.Abstract2;

abstract class  Animal {

    public void eat(){
        System.out.println("This animal eats food");
    }
    //추상메서드
    public abstract void makeSound(); //{} 중괄 쓰면 안됨  - 상속받는 클래스에서 구현
    
}
//추상클래스를 상속받은 구현 클래스
class Dog extends Animal{

    @Override //재정의
    public void makeSound() {
        System.out.println("멍엉 컹컹");
    }

}
class Cat extends Animal   {

    @Override
    public void makeSound() {
        System.out.println("야옹 야옹");
    }
    // Animal 이라는 추상클래스를 상속받은 
    //구체클래스 cat  은  Animal 있는 추상클래스 makeSound()를
    //override(재정의) 해서 반드시 구현해야함
}



public class AbstractEx {
    public static void main(String[] args) {
        //주의 - 추상클래스는 인스턴스(객체)를 생성합 수 없다.
         // Animal animal = new Animal() ;

         //구체 클래스의 객체를 생성
         //Dog dog = new Dog();
         //dog.eat();
         //dog.makeSound();

         Animal dog = new Dog(); //업캐스팅
         Animal cat = new Cat();

         dog.eat();
         dog.makeSound();
         cat.eat(); // 일반 메서드 호출
         cat.makeSound(); // 오버라이딩된 메서드 호출
    }
}
