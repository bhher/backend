package a1127.downCasting;

public class DownCastingEx {
    public static void main(String[] args) {
        Parent parentRef = new Child(); //업캐스팅 -자식객체를 부모타입으로 변환
        parentRef.show(); // 자식클래스 메서드 (다형성) 
        //다운캐스팅
        if(parentRef instanceof Child){
            Child childRef = (Child) parentRef; //명시적 형변환을 해줘야함
            childRef.childspecial();
        }else{
            System.out.println("다운캐스팅실패");
        }

    }
}

class Parent {
    void show(){
        System.out.println("부모클래스 메서드");
    }   
}
class Child extends Parent{

    @Override
    void show() {
        System.out.println("자식클래스 메서드");
    }
    void childspecial(){
        System.out.println("자식특별한 메서드"); 
    }

}
