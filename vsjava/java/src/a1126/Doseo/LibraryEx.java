package a1126.Doseo;

public class LibraryEx {
    public static void main(String[] args) {

        //EBook 객체 생성
        EBook eBook = new EBook("이것이 자바다", "신용권", "2015-1113", 5.6, "PDF");
        //PrintedBook 객체 생성
        PrintedBook printedBook = new PrintedBook("첨만난리액트","이인제" , "2016-0124", 464, 0.8);

        //도서 정보 출력
        System.out.println("EBook Information:");
        eBook.displayInfo();
        System.out.println();
        System.out.println("Printed Book Information");
        printedBook.displayInfo();

    }
}
