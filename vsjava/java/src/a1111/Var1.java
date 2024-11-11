package a1111;

public class Var1 {
    public static void main(String[] args) {
        //초기화되지않은 변수를 연산식에서 사용할 수 없다.
        int value= 0;  
        int result = value + 10; 
        System.out.println(result);
    }
}
