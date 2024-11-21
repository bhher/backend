package a1121.methodOverloding;

public class Main1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // 메서드 호출 및 출력
        System.out.println(calc.add(3, 5));       // 두 정수 더하기
        System.out.println(calc.add(1, 2, 3));   // 세 정수 더하기
        System.out.println(calc.add(4.5, 5.5));  // 두 실수 더하기
    }
}
