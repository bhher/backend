package a1118;

import java.util.Arrays;

public class Shuffle1 {
    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        for(int i=0;i < numArr.length; i++){
            System.out.print(numArr[i] + ",");
        }
        System.out.println(Arrays.toString(numArr));
        //배열의 내용을 문자열로 변환
        //Arrays.toString 사람이 읽을 수 있는 형식으로 배열을 내용확인

        for (int i = 0; i < 100; i++){
            int n = (int)(Math.random() * 10);//0~9 까지 나옴
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
