package a1213;

import java.util.Scanner;

public class Word {
  public static void main(String[] args) {
    Brain Book = new Brain();
        while (true) {
            Book.Menu();

            Scanner scan = new Scanner(System.in);
            System.out.print("메뉴를 선택해 주세요 >>");
            String select = scan.nextLine();

            if(select.equals("1")){
                Book.AddWord();
            }else if(select.equals("2")){
                Book.WordSearch();
            }else if (select.equals("3")){
                Book.DeleteWord();
            }else if (select.equals("4")){
                Book.Test();
            }else if (select.equals("5")){
                Book.WordList();
            }else if (select.equals("6")){
                Book.Exit();
                break;
            }else{
                System.out.println("1 ~ 6 까지 숫자만 입력하세요. ");
            }    
        }
  }

}
