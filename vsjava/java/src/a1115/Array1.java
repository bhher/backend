package a1115;

public class Array1 {
    public static void main(String[] args) {
    //배열사용이유 
    // 같은 타입의 여러변수를 하나로 묶어 관리 할 수 있다.
    //배열은 한번 생성하면 크기가 고정된다.
    // 배열의 각요소는 인덱스를 통해 접근할 수 있다.
    // a=1, b=2, c=3, d=4,


    //1. 배열은 선언하고 생성하는 두가지 방법
   // int[] numbers = new int[5]; //정수형 배열 , 크기5
    //int[] scores = {90,80,70,85,95}; //크기 5, 초기값 지정
    
        //배열선언
        //= - 자료형 변수명[];
        int arr[];
        arr = new int[5];

        //배열생성
        // - 변수명 = new 자료형[개수];

        //배열요소에 접근
        // : index(0부터 시작하는 순서번호)로 접근.
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
		arr[4] = 5;

        //배열의 길이 : 배열요소의 갯수 = 배열.length;
        int n = arr.length;
        System.out.println("배열의 길이 : " +n); //5
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

    }
}
