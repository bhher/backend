package a1129.book;

import java.util.ArrayList;
import java.util.Scanner;

import a1129.AccommodationReserve.Accommodation;

// 책 관리
public class LibraryManager {
    private ArrayList<Library> librarys; // 책들
    private ArrayList<Library> booklocation;

    public LibraryManager(){
        librarys = new ArrayList<>();
        booklocation = new ArrayList<>();
        
        librarys.add(new Library("이것이 자바다", "신용권", "A구역", "979-11-6921-229-8"));
        librarys.add(new Library("처음만난 리액트", "이인제", "B구역", "979-11-6921-169-7"));
        librarys.add(new Library("웹표준의 정석", "고경희", "C구역", "979-11-6303-622-7"));
    }

    public void allLibrary() {
        System.out.println("대출 가능한 도서 보기");
        for(Library library : librarys){
            if (library.isAvailable()) {
                System.out.println(library);
            }
        }
    }

    public boolean booklocations(String name) {
        for(Library library : librarys){
            if (library.getTitle().equalsIgnoreCase(name) && library.isAvailable()) {
                library.book();
                booklocation.add(library);
                return true;
            }
        }
        return false;
    }

    public void booklocation() {
        System.out.println("대출한 도서 : ");
        for(Library booklocation : booklocation){
            System.out.println(booklocation);
        }
    }

    public void addLibrary(String newTitle, String newAuthor, String newLocation, String newIsbn) {
        booklocation.add(new Library(newTitle, newAuthor, newLocation, newIsbn));
    }

    public void delLibrary(String dname) {
        boolean result = false;
        for(Library library : librarys){
            if(library.getTitle().equalsIgnoreCase(dname)){
                if(library.isAvailable()){
                    librarys.remove(library);
                    result = true;
                    break;
                }else{ 
                    result = false;
                    break;
                }
            }
        }
        if(result){
            System.out.println("삭제됨");
        }else{
            System.out.println("삭제 안됨");
        }
    }

    public void updateLibrary(String uname) {
        int i = 0;
        int index = -1;
        int menu = -1;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        Library newA = new Library();
        System.out.println(uname);
        for(Library a : librarys){ // 리스트 순회하면서 같은 이름이 있는지
            i++;
            if(a.getTitle().equals(uname)){
                index = i - 1; // index = 0;
                newA = a; // 이름이 같으면 객체를 생성해서 해당 객체를 newA에 넣어놓는다.
            }
            System.out.println(a.getTitle().equals(uname) + " " + a.getTitle() + " " + uname);
        }
        if(index != -1){ 
            System.out.print("뭘 수정할건데?\n 1.도서 이름 \t 2.도서 저자 \t 3.도서 위치 \t 4.도서ISBN \n >>");
            menu = sc.nextInt();
            sc.nextLine();
            while(flag){
                switch (menu) {
                   case 1:
                       System.out.println("수정할 이름");
                       newA.setTitle(sc.nextLine());
                       librarys.set(index, newA);
                       flag = false;
                       break;
                   case 2:
                       System.out.println("수정할 저자");
                       newA.setAuthor(sc.nextLine()); //위치가 수정된 객체
                       librarys.set(index, newA); // 리스트에 수정
                       flag = false;
                       break;
                   case 3:
                       System.out.println("도서 위치");
                       newA.setLocation(sc.next()); //위치가 수정된 객체
                       librarys.set(index, newA); // 리스트에 수정
                       flag = false;
                       break;
                   case 4:
                       System.out.println("수정할 ISBN");
                       newA.setIsbn(sc.nextLine());
                       librarys.set(index, newA);
                       flag = false;
                       break;
                   default:
                       System.out.println("1~4번 중에 입력하세요");
                       break;
                }
            }
        }else{
            System.out.println("찾는 도서가 없어서 업데이트할 수 없습니다.");
        }
    }

    public void showLibrary(String sname) {
        for(Library a : librarys){
            if(a.getTitle().equalsIgnoreCase(sname)){
                System.out.println(a.toString());
            }
        }
    }

    
}
