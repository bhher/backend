package a1114;

public class Switch4 {
    public static void main(String[] args) {
       char grade = 'B';
     switch(grade){
        case 'A':
        case 'a':
            System.out.println("우수회원 입니다.");
            break;
        case 'B':
        case 'b':
            System.out.println("일반회원 입니다.");
            break;
        default:
            System.out.println("손님 입니다..");
     }
    }
}
