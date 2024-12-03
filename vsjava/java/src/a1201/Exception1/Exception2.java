package a1201.Exception1;

public class Exception2 {
    public static void main(String[] args) {
        String str = null;
        //NULL 참조
        //객체가 null인 상태에서 해당객체를 호출하거나 멤버에 접근할 때 발생
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
           System.out.println("널 참조가 발생" + e.getMessage());
        }
    }
}
