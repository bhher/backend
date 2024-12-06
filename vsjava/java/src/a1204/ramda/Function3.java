package a1204.ramda;
//함수형인터페이스
interface Calculator {
    int sum(int a, int b);
   
}


public class Function3 {
    public static void main(String[] args) {
        Calculator mc = Integer::sum; //각요소를 합산해라
       
        int result =  mc.sum(3,4);
        System.out.println((result));
    }
}
