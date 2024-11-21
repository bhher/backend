package a1121.method;

public class MethodTypeTest {
    public static void main(String[] args) {
        MethodType test = new MethodType();

        test.printName(); //출력이 홍길동
        int k = test.printNumber(); // 10만 반환
        System.out.println("반환값은 : " + k);
        test.multiply(2, 4.5); 
        // Multiply 함수로 곱셈을 하고 곱한 값을 인쇄 

    }
}
