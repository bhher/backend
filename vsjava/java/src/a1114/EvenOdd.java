package a1114;

public class EvenOdd {
    public static void main(String[] args) {
        int number =7;
        // 조건식 ? 조건이 참일 때 값 : 조건이 거짓일 때 값
        String result = (number % 2 == 0) ? "짝수" : "홀수";
        System.out.println(result);
    }
}
