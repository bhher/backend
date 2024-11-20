package a1119;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        // 정수 10개를 저장할 수 있는 배열을 생성하고, 각 요소에 1부터 10까지의 값을 순서대로 저장하세요. 
        // 그리고 모든 요소의 합을 구하여 출력하는 프로그램을 작성해 보세요.
        int[] numbers = new int[10];
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i+1;
            sum += numbers[i]; // numbers[i] 값을 sum 누적시킨다.
        }
        System.out.println(Arrays.toString(numbers)); //배열을 문자열로 보여줌
        System.out.println("모든 요소의 합:" + sum);

        
    }
}
