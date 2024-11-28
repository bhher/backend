package a1127.animal2;

public class Fish extends Animal{
    public Fish(String name, int age){
        super(name,age );
    }

    @Override
    void move() { 
        System.out.println("이동 방식: 지느러미를 이용해 헤엄친다");
    }

    @Override
    void sound() {
        System.out.println("소리: ...");
    }

}
