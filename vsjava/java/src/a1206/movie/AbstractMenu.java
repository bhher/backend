package a1206.movie;

import java.util.Scanner;


abstract class AbstractMenu implements Menu{
//추상클래스
//  abstract 클래스는 Menu 인터페이스를 구현하며, 추후 메인메뉴(Mainmenu)
//와 관자메뉴(AdminMenu)의 부모클래스가된다.
    protected String menuText; //기본문구 - 인스턴수 변수
    protected Menu prevMenu; //이전메뉴 - 인스턴스변수
    
  

    protected static final Scanner scanner =new Scanner(System.in);

    public AbstractMenu(String menuText, Menu prevMenu) {
        this.menuText = menuText;
        this.prevMenu = prevMenu;
    }

    public void print(){
        System.out.println("\n" + menuText); //메뉴출력
    }

    public void setPrevMenu(Menu prevMenu) {
        this.prevMenu = prevMenu;
    } //세터 메소드, 메뉴를 종료한 후 돌아갈 이전 메뉴를 설정

    
}
