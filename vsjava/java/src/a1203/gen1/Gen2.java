package a1203.gen1;

import java.util.ArrayList;

public class Gen2 {
    public static void main(String[] args) {
        ArrayList<String>  piches = new ArrayList<>(); //컬렉션
        //제네릭스로 자료형을 선언하면 그이후로는 자료형을 형 변환하는 과정 필요없음
        piches.add("123");
        piches.add("129");
        
        String one =  piches.get(0);
        String two =  piches.get(0);


    }
}
