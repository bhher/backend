package a1129.book;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();
        boolean flag = true;
        while (flag) {
            System.out.println("\n도서검색 시스템에 오신 것을 환영합니다.");
            System.out.println("1.대출 가능한 도서 보기");
            System.out.println("2.도서 대출하기");
            System.out.println("3.대출한 도서 보기");
            System.out.println("4.도서 추가하기");
            System.out.println("5.도서 삭제하기");
            System.out.println("6.도서 정보 수정하기");
            System.out.println("7.도서 내용 보기");
            System.out.println("8.종료");
            System.out.print("원하는 작업을 선택하세요 >> ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("대출 가능한 도서");
                    manager.allLibrary();
                    break;
                case 2:
                    System.out.println("도서 대출하기");
                    System.out.println("대출하려는 도서의 이름을 입력하세요 : ");
                    String libraryName = sc.nextLine();
                    if (manager.booklocations(libraryName)) {
                        System.out.println("도서가 성공적으로 대출되었습니다.");
                    }else{
                        System.out.println("도서가 대출 가능하지 않거나 존재하지 않습니다.");
                    }
                    break;
                case 3:
                    System.out.println("대출한 도서 보기");
                    manager.booklocation();
                    break;
                case 4:
                    System.out.println("도서 추가하기");
                    System.out.print("추가하려는 도서의 이름을 입력하세요\n 도서이름 >>");
                    String newTitle = sc.nextLine();
                    System.out.print("도서 저자 >> ");
                    String newAuthor = sc.nextLine();
                    System.out.print("도서 위치 >> ");
                    String newLocation = sc.nextLine();
                    System.out.println("도서의 ISBN");
                    String newIsbn = sc.nextLine();
                    sc.nextLine(); // 개행문자 초기화
                    System.out.println(newTitle + "추가하려는 숙소 이름");
                    if(newTitle.equals("")){ // 숙소이름이 입력되어있지 않으면 재입력받기
                        System.out.print("추가하려는 숙소의 이름을 입력하세요\n 숙소이름 >>");
                        newTitle = sc.nextLine();
                    }
                    manager.addLibrary(newTitle, newAuthor, newLocation, newIsbn);
                    System.out.println("숙소추가 완료");
                    break;
                case 5:
                    System.out.println("삭제 시작");
                    System.out.print("삭제하려는 호텔 이름을 적어주세요 >> ");
                    String dname = sc.nextLine();
                    if(dname.equals("")){
                        System.out.println("삭제하려는 혼텔이름 재입력\n 이름>>");
                        dname = sc.nextLine();
                    }
                    manager.delLibrary(dname);
                    System.out.println("삭제 끝");
                    break;
                case 6:
                    System.out.println("수정 시작");
                    System.out.print("수정하려는 도서를 작성하세요 :");
                    String uname = sc.nextLine();
                    System.out.println(uname);  
                    if (uname.equals("")) {
                        System.out.print("추가하려는 도서의 이름을 입력하세요. \nname>>");
                        newTitle = sc.nextLine();
                    }
                    manager.updateLibrary(uname);
                    System.out.println("수정 끝");
                    break;
                case 7:
                    System.out.println("조회 시작 \n 도서 이름 입력 >> ");
                    String sname = sc.nextLine();
                    if(sname.equals("")){
                        System.out.println("조회하려는 도서의 이름을 입력하세요. \n uname>>");
                        newTitle = sc.nextLine();
                    }
                    manager.showLibrary(sname);
                    System.out.println("조회 끝");
                    break;
                case 8:
                    System.out.println("종료");
                    flag = false;
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }


        }
    }
}
