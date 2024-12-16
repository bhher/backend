import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Calculator {
  
  String [] total = {"전기세","수도세","가스비","월세","식수대","관리비"};
  ArrayList<Integer> 비용항목들 =new ArrayList<>(Arrays.asList(0,0,0,0,0,0));
  int 전기세;
  int 수도세;
  int 가스비;
  int 월세;
  int 식수대;
  int 관리비;
  int 빨래;
  


  Scanner sc=new Scanner(System.in);

public void 반복(){
  for(int i=0;i<total.length;i++){
    gogo(i);

  }
}

  public void gogo(int i) {
    boolean validInput=false;
    while (!validInput) {
      try{
        System.out.print( total[i]+" 입력:");
        int value=sc.nextInt();
        비용항목들.set(i,value);
        System.out.println( total[i]+":"+비용항목들.get(i));
        validInput=true;
  
        }catch(InputMismatchException e){
          System.out.println("숫자로만 입력해주세요.");
          sc.nextLine();
          continue;
          
        }  
    }
    
  }


  public void clean() {
    boolean validInput=false;
    while (!validInput) {
      try{

        System.out.print("1회 빨래비용 입력:");
        int 회당빨래비용=sc.nextInt();
        System.out.print("1주일 빨래횟수:");
        int 주일빨래횟수=sc.nextInt();
    
        빨래=회당빨래비용*주일빨래횟수*4;
        System.out.println("빨래 계산공식: 비용*1주일빨래횟수*4");
        System.out.println("빨래:"+빨래);
        validInput=true;

      }catch(InputMismatchException e){
        System.out.println("숫자로만 입력해주세요.");
          sc.nextLine();
          continue;
          
      }
    }

  
  }
  public void result(){
    
    int 전기세=비용항목들.get(0);
    int 수도세=비용항목들.get(1);
    int 가스비=비용항목들.get(2);
    int 월세=비용항목들.get(3);
    int 식수대=비용항목들.get(4);
    int 관리비=비용항목들.get(5);
    int 합계=전기세+수도세+가스비+월세+ 식수대+관리비+빨래;
    for(int i=0; i<비용항목들.size();i++){
     System.out.println(total[i]+" : "+비용항목들.get(i));
    }
    System.out.println("빨래:"+빨래);
    System.out.println("한달 고정지출내역:"+합계);

  }

  public Calculator(int 전기세, int 수도세, int 가스비, int 월세, int 빨래, int 식수대, int 관리비) {
    this.전기세 = 전기세;
    this.수도세 = 수도세;
    this.가스비 = 가스비;
    this.월세 = 월세;
    this.빨래 = 빨래;
    this.식수대 = 식수대;
    this.관리비 = 관리비;
  }
  public int get전기세() {
    return 전기세;
  }
  public void set전기세(int 전기세) {
    this.전기세 = 전기세;
  }
  public int get수도세() {
    return 수도세;
  }
  public void set수도세(int 수도세) {
    this.수도세 = 수도세;
  }
  public int get가스비() {
    return 가스비;
  }
  public void set가스비(int 가스비) {
    this.가스비 = 가스비;
  }
  public int get월세() {
    return 월세;
  }
  public void set월세(int 월세) {
    this.월세 = 월세;
  }
  public int get빨래() {
    return 빨래;
  }
  public void set빨래(int 빨래) {
    this.빨래 = 빨래;
  }
  public int get식수() {
    return 식수대;
  }
  public void set식수(int 식수대) {
    this.식수대 = 식수대;
  }
  public int get관리비() {
    return 관리비;
  }
  public void set관리비(int 관리비) {
    this.관리비 = 관리비;
  }

  
}

// 전기세,수도세,가스비,월세,빨래비용,식용물,관리비