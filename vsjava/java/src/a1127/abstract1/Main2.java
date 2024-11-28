package a1127.abstract1;



abstract class GameCharacter{
    //템플릿 메서드 - 공통로직을 제공 , 세부구현은 자식
    public void performAction(){
                prepare();
                action();
                finish();
            }
            
    private  void prepare(){
        System.out.println("캐릭터를 준비합니다.");
    }
    //추상메서드 : 구체적인 행동은 자식캐릭터에서 구현
    protected abstract void action();
   // 공통 종료 단계
    private void finish() {
        System.out.println("행동을 마무리합니다.");
    }   
}
class Warrior extends GameCharacter{

    @Override
    protected void action() {
       System.out.println("전사가 칼을 휘두릅니다.");
     
    }   

}
 class Mage extends GameCharacter {

    @Override
    protected void action() {
        System.out.println("마법사가 마법을 시전합니다.");
    }
} 


public class Main2 {
    public static void main(String[] args) {
        GameCharacter warrior = new Warrior(); //자식을 부모로 업캐스팅
        GameCharacter mage = new Mage();

        System.out.println("전사 행동:");
        warrior.performAction();

        System.out.println("\n마법사 행동:");
        mage.performAction();
    }
}
