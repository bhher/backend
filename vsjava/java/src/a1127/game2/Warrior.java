package a1127.game2;

public class Warrior extends Hero {
   
    public Warrior(String name){
        super(name);
    }
    public void groundCutting(){
        System.out.println("대지가르기!");
    }
}
// Warrior 는 부모를 상속받고 groundCutting() 메서드를 가지고 있다.