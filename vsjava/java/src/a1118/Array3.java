package a1118;

public class Array3 {
    public static void main(String[] args) {
        //배열 변수 선언과 배열 생성
        int[] arr1 = new int[3];  //초기값으로 0 이 들어있음
        //배열 항목의 초기값 출력
        for(int i=0; i <3; i++){
            System.out.print("arr1["+i+"] : "+ arr1[i] + ", ");
        }
        //배열 항목의 값 변경
        System.out.println();
        arr1[0] = 10;
        arr1[1] = 20;
		arr1[2] = 30;
        for(int i=0; i <3; i++){
            System.out.print("arr1["+i+"] : "+ arr1[i] + ", ");
        }
        System.out.println();
        //배열 변수 선언과 배열 생성
        double[] arr2 = new double[3];
        //배열 항목의 초기값 출력
        for(int i=0; i<3; i++) {
            System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
        }
        System.out.println();
        //배열 항목의 값 변경
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        //배열 항목의 변경값 출력
        for(int i=0; i<3; i++) {
            System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
        }
        System.out.println("\n");

        //배열 변수 선언과 배열 생성
		String[] arr3 = new String[3];
		//배열 항목의 초기값 출력
		for(int i=0; i<3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}
		System.out.println();
		//배열 항목의 값 변경
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		//배열 항목의 변경값 출력
		for(int i=0; i<3; i++) {
			System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
		}

    }
}
