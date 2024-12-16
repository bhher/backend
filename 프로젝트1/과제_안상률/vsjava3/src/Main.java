import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
 
  
    public static void main(String[] args) {
      boolean run=true;
      while(run){
      Scanner sc= new Scanner(System.in);
      System.out.println();
      System.out.println("----------소비내역 계산기------------");
      System.out.println("1.소비내역작성");
      System.out.println("2.소비내역 확인");
      System.out.println("3.소비내역 삭제");
      System.out.println("4.종료");
      System.out.println("메뉴선택하세요");
      int choice=0;
      try{
        choice=sc.nextInt();

      }catch(InputMismatchException e){
        System.out.println("번호로 입력해주세요.");
        sc.nextLine();
        continue;

      }
      switch(choice){
        case 1:
        Calculator calc=new Calculator(0, 0 , 0, 0, 0, 0, 0);
        calc.반복();
        calc.clean();
        calc.result();
        
        run=false;

        break;
        case 2:
        System.out.println("미구현");
        break;
        case 3:
        System.out.println("미구현");
        break;
        case 4:
        System.out.println("미구현");
        break;
        default:
        System.out.println("잘못입력하셨습니다. 번호로 입력해주세요.");
        break;
      }
    }

      

      



      

    
  }

}

// 한달 러프한 소비내역
// 1. 소비내역작성 2. 소비내역확인 3. 소비내역삭제 4.종료
// 전기세,수도세,가스비,월세,빨래비용,식용물,관리비