package a0802.movie;

import java.io.IOException;
import java.util.ArrayList;

import a0802.movie.Movie;

public class AdminMenu extends AbstractMenu {
   

    private static final AdminMenu instance = new AdminMenu(null);
    private static final String ADMIN_MENU_TEXT = // 기본 문구
            "1: 영화 등록하기\n" +
            "2: 영화 목록 보기\n" +
            "3: 영화 삭제하기\n" +
            "b: 메인 메뉴로 이동\n\n" +
            "메뉴를 선택하세요: ";


    public AdminMenu( Menu prevMenu) {
        super(ADMIN_MENU_TEXT, prevMenu); //부모생성자 호출       
    }
    public static AdminMenu getInstance(){
        return instance;
    }
    @Override
    public Menu next() {
       switch (scanner.nextLine()) {
        case "1":
            createMovie(); //영화 등록진행
            return this; //관리자 메뉴 객체 반환
        case "2":
            printAllMovies(); //영화 목록 출력
            return this; //관리자 메뉴 객체 반환
        case "3":
            deleteMovie(); //영화 삭제 진행
            return this; //관리자 메뉴 객체 반환
        case "b": return prevMenu; //b입력시,이전메뉴를 반환
        default:return this;
       }
    }
    private void deleteMovie() {
        printAllMovies(); //모든 영화를 출력
        System.out.println("삭제할 영화를 선택하세요");
        try{
            Movie.delete(scanner.nextLine());
            //사용자 입력값 기준으로 삭제 요청
        }catch(IOException e){
            System.out.println(">>삭제 실패");
        }
    }
    private void createMovie() {
        System.out.print("제목 : ");
        String title = scanner.nextLine();
        System.out.print("장르 : ");
        String genre = scanner.nextLine();
        Movie movie = new Movie(title, genre);
        try{
            movie.save();
        }catch(IOException e){
            System.out.println(">> 실패하였습니다.");
        }

    }
    private void printAllMovies() {
        try{
            ArrayList<Movie> movies = Movie.findAll();
            System.out.println();
            for(int i=0; i < movies.size();i++){
                System.out.printf("%s\n",movies.get(i).toString());
            }
        }catch(IOException e){
            System.out.println("데이터 접근에 실패"); //예회처리
        }
    }
    

}
