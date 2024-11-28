package a1128.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList5 {
    public static void main(String[] args) {
        //특정요소확인
        ArrayList<String> list = new ArrayList<>();

       // 데이터 추가
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        //Array List정렬
        System.out.println("일단 출력 : " + list);
        
        Collections.sort(list);
        System.out.println("정렬후 출력 : " + list);

        Collections.reverse(list);
        System.out.println("열순 정렬후 출력 : " + list);

        
    }
}
