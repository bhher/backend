package a1128.ArrayList;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        //특정요소확인
        ArrayList<String> list = new ArrayList<>();

       // 데이터 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        //요소가 존재하는지 확인
        System.out.println("바나나 있니? "+ list.contains("Banana")); //true
        System.out.println("포도 있니? "+ list.contains("Grapes")); // false

        //크기확인 -  배열의 숫자를 파악 length -> ArrayList - size

        System.out.println("list의 갯수 : " + list.size());

        //인덱스 요소 검색
        String fruit = list.get(1);
        System.out.println("검색된 내용 출력" + fruit);

        //for-each -> enhance for문
        for(String fruit1 :  list){
            System.out.println(fruit);
        }
        //Array List정렬

        

    }
}
