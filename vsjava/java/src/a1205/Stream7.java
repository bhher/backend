package a1205;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Stream7 {
    public static void main(String[] args) {
        //Interger 외부 반복자
        List<Integer> list = (List) Arrays.asList(10,20,30,40,50);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value + " ");
        }
    }
}
