package a1126.Doseo;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    //생성자
    public Book(String title, String author, String iSBN) {
        this.title = title;
        this.author = author;
        ISBN = iSBN;
    }
    //도서 정보 출력 메서드
    public void displayInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
    

    
}
