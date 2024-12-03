package a1201.Exception1;

public class Execption3 {
    public static void main(String[] args) {
        //숫자 형식오류
        String str = "abc";
        try{
          int number = Integer.parseInt(str);
        }catch(NumberFormatException e){
            System.out.println("숫자의 형식이 올바르지않아요" + e.getMessage());
        }
    }
}
