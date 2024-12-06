package a1204.ramda;
//함수형인터페이스
interface Calculator {
    int sum(int a, int b);
    //int mul(int a , int b);
    //Calculator 인터페이스의 메서드가 1개이상이면 람다함수 사용 못함
}


public class Function2 {
    public static void main(String[] args) {
        Calculator mc = (int a, int b) -> a + b; //람다를 적용한 함수
        //괄호사이의 int a, int b는 Calculator 인터페이스 sum 함수의 입력항목이 배당
        //뒤에  -> a + b가 리턴값에 해당
        //이렇게 람다함수를 사용하면 MyCalbulator와 같은 실제 클래스 없이도 
        // Calculator 객체를 생성할 수 있고, 일반적인 코드보다 훨씬 간단한다.
        int result =  mc.sum(3,4);
        System.out.println((result));
    }
}
