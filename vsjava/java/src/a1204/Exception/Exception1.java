package a1204.Exception;

public class Exception1 {
    public static void main(String[] args) {
            //1. 배열인덱스 초과
        int[] numbers = {1,2,3};
        try{
            System.out.println(numbers[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱스 범위 초과"+ e.getMessage());
        }

    }
}
