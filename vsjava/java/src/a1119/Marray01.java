package a1119;

public class Marray01 {
    public static void main(String[] args) {
        int arr[][]  = new int [2][3]; //2행 3열 - 2차원 배열

        arr[0][0] = 1;
        arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;

        // [1][2][3]
        // [4][5][6]
        // arr.length :첫번재 차원 배열요소의 갯수 2
        // arr[i].length : 두번째 차원의 배열요소의 개수
        for(int i=0; i < arr.length; i++){
            for(int j = 0;j < arr[i].length ;j++ ){
                System.out.print(arr[i][j] + " ");
            }
        }

    }
}
