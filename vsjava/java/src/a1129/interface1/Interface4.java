package a1129.interface1;

interface Swimmable {
    void swim();
    static void checkWater(){
        System.out.println("물이 깨끗한지 확인한다.");
    }
    
}
class Fish implements Swimmable{

    @Override
    public void swim() {
        System.out.println("물고기가 수영한다.");
    }
}
public class Interface4 {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.swim(); //물고기가 수영한다.
        //fish.checkWater(); X
        //static 메서드는 인터페이스 이름으로 호출 가능
        Swimmable.checkWater(); 
        //static 메서드는 
        //인터페이스에 정적 메서드를 정의할 수 있음.
        //정적메서드는 인터페이스 이름으로 직접호출하며, 인스턴스를 생성하지 않아도 사용가능
        //구현 클래스에서는 상속받거나 오버라이드 할 수 없음
    }
}
