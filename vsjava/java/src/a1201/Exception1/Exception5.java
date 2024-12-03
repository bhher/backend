package a1201.Exception1;

class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
//CustomException 클래스는 'Exception' 클래스를 상속하여 사용자 정의 예외를 만든다.
//생성자에서  super(message);를 호출하여 부모 클래스인 Exception 생성자를 호출
public class Exception5 {
    //사용자 정의 예외
    public static void main(String[] args) {
       try {
            validate(15);
        } catch (CustomException e) {
            System.out.println("사용자 정의 예외"+e.getMessage());
        }            
   }
   
      private static void validate(int age) throws CustomException {
           if(age < 18){
            throw new CustomException("나이는 18세 이상이여야함");
            }
        }
}
