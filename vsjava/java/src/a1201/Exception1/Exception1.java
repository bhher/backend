package a1201.Exception1;

public class Exception1 {
    public static void main(String[] args) {
        //배열의 인텍스초가
        int [] numbers = {1,2,3};
        try{
        System.out.println(numbers[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱스 범위초과 "+ e.getMessage());
        }
    }
}
