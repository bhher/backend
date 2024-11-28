package a1128.ArrayList;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        //특정위치에 요소삽입 가능

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //삽입
        list.add(1,15);
        //인덱스 번호 1번에 15삽입
        //출력 
        System.out.println("ArrayList: " + list);

        list.remove(1);  //인덱스1번 삭제
        System.out.println("ArrayList: " + list);    
        list.remove(Integer.valueOf(30));
        //값이 30인 List를 삭제

        System.out.println("ArrayList: " + list); // [10]
    }
}
