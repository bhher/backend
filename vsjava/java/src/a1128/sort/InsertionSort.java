package a1128.sort;

import java.util.Arrays;

public class InsertionSort {
    
    public static void main(String[] args) {
        int [] array = {64,34,25,17,22,11,90};
        InsertionSort(array);
        System.out.println("sort Array: " + Arrays.toString(array));
     }
        
    public static void InsertionSort(int[] array) {
        int n = array.length;
        for(int i=1 ; i< n;i++){
            int key = array[i];  //key =1;
            int j = i - 1; // j = 0
            while (j>=0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
