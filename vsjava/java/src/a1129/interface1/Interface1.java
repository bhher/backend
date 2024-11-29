package a1129.interface1;

interface Animal{
    // void abc(){
    //     System.out.println("안녕하세요");
    // }
    public abstract void cry();
    //추상 메소드만 사용
}
class Cat implements Animal{
    @Override
    public void cry() {
        System.out.println("냐옹냐옹!");
    }
}
class Dog implements Animal{
    @Override
    public void cry() {
        System.out.println("멍멍");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        c.cry();
        d.cry();
        Animal e = new Cat();
        Animal f = new Dog();
        e.cry();
        f.cry();
    }
}
