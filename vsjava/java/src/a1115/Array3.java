package a1115;

public class Array3 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
             arr[i] = i+1;
        }
        arr[3] = 88; //특정한 배열의 요소값 변경가능 
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
