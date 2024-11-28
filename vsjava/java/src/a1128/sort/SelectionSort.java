package a1128.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {64,34,25,17,22,11,90};
        SelectionSort(array);
        System.out.println();
        System.out.println("선택정렬로 정렬된배열: "+ Arrays.toString(array));
        //배열을 문자열로 변환후 출력
   }
        
   public static void SelectionSort(int[] array) {
    int n = array.length;
    for(int i=0; i< n-1; i++){
        int minIndex = i;
        for(int j= i+1;j < n;j++){
            if(array[j] < array[minIndex]){
                minIndex = j;
            }
        }
        int temp = array[minIndex]; //제일 작은 값이 들어 있는 방번호 내용 3
        array[minIndex] = array[i];
        array[i] = temp;
    }


}       
}
