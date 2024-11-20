package a1118;

import java.util.Scanner;

public class Marray3 {
    public static void main(String[] args) {
        // 2행 3열 배열 생성
        //[][][]
        //[][][]

        //비정방 행렬 배열
        //[][]
        //[][][][]
        //[][][]

        int [][] a = new int[3][];
        a[0] =  new int[2];
        a[1] = new int[4];
		a[2] = new int[3];
        // 입력 
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < a.length; i++){
            System.out.print("입력해주세요: ");
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
//출력하려면 
        for(int i=0; i < a.length; i++){
           
            for(int j = 0; j < a[i].length; j++){
             System.out.print(a[i][j] + " ");
            }
        }



    }
}
