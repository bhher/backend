package a1115;

import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
      System.out.print("총개수를 입력하시오:"); 
     
      int n = sc.nextInt();

      int arr[] = new int[n];
      
      for (int i = 0; i < n; i++) {
        System.out.print(i+1 + "번째 숫자를 입력하세요"); 
        
            arr[i] = sc.nextInt();
      }

        int min = Integer.MAX_VALUE;
    
      for (int i = 0; i < arr.length; i++) {
          if(min > arr[i]){
           
             min =  arr[i];
          }
       }
     
      System.out.println("최소값 : " + min);
       sc.close();

    }
}
