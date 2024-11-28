package a1127.abstract1;

//추상 클래스 정의
abstract class  Animal {
    
    //공통속성
    String name;

    public Animal(String name) {
        this.name = name;
    }
    //일반 메서드
    public void sleep(){
        System.out.println(name + "이(가) 잠을 잡니다.");
    }

    //추상 메서드 ( 자식 클래스에서 구현 필요)
    public abstract void sound();
}
//구체적인 자식 클래스
class Dog extends Animal{
    
    public Dog(String name){
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + "이(가) 멍멍 짖습니다.");
      
    }

}
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void sound() {
       System.out.println(name + "이(가) 야옹소리를 냅니다.");      
    }
    

}






public class Main1 {
    public static void main(String[] args) {
        // Animal animal = new Animal() ; 추상클래스는 캑체 생성 불가능
        Animal dog = new Dog("강아지");
        Animal cat = new Cat("고양이");
        dog.sleep(); //공통메서드 호출
        dog.sound();  //강아지만의 메서드 호출

        cat.sleep();
        cat.sound();

        
    }
}
