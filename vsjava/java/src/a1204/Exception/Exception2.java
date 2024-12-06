package a1204.Exception;

public class Exception2 {
    public static void main(String[] args) {
       //2. NUll 참조
       //객체가 null 인 상태에서 해당 객체의 메서드를 호출하거나 멤버에 접근할 때 발생
       String str = null;
       try{
            System.out.println(str.length());
       }catch(NullPointerException e){
            System.out.println("널 참조가 발생"+ e.getMessage());
       }

    }
}
