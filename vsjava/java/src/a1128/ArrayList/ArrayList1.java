package a1128.ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;   
        //추가 시 배열 크기 초과 -> 새로운 배열 생성
        //삽입/ 삭제 비효울성
        //-> 배열 중간에 삽입 도는 삭제가 발생하면 , 기존 요소 이동
        // 메서드 부족 크기조정, 정렬 , 탐색등의 작업의 메서드지원 안됨
        //타입 제한 부족

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);



        //출력 
        System.out.println("ArrayList: " + list);

        //변경
        list.set(3, 50);
        
        //출력 
        System.out.println("ArrayList: " + list);
    }
}
