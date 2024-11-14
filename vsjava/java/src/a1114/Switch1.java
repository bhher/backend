package a1114;

public class Switch1 {
    public static void main(String[] args) {
       int num = (int)(Math.random()*4)+8;
       System.out.println();
       System.out.println(num);
     switch(num){
        case 8:
            System.out.println("출근합니다.");
            break;
       case 9:
            System.out.println("회의를 합니다.");
            break;
        case 10 :
            System.out.println("업무를 시작합니다.");
            break;
      
        default:
            System.out.println("외근을 나갑니다.");
     }
    }
}
