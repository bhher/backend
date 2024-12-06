package a1206.movie;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("프로그램을 시작합니다."); //초기메시지
        Menu menu = MainMenu.getInstance(); //"메인메뉴를 가져옴"
        //메인메뉴 객체생성
        while (menu !=null) {//메뉴가 있으며 계속 반복
            menu.print(); //현재메뉴 출력
            menu = menu.next(); //사용자 입력후 , 다음메뉴로 갱신           
        }
        System.out.println("프로그램이 종료됩니다."); //프로그램 종료 문구
    }
}
interface Menu{
    void print(); //메뉴 출력
    Menu next(); //다음 메뉴로 이동
    //next 이름에 메서드 , 메뉴타입의 객체 반환

}