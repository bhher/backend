package a1114;

public class MaxValue {
    public static void main(String[] args) {
        //두 정수가 주어졌을 때, 그 중 더 큰 값을 출력하는 프로그램을 작성하세요.
        int num1 = 12, num2 = 9; // 두 수를 이곳에서 설정하세요.
          // 삼항 연산자를 사용해 최대값 구하기
          int max = (num1 > num2) ? num1 : num2;
        
          System.out.println("더 큰 값은: " + max);
    }
}
