package a1113;

public class Increase {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;
        
        x++; //x = x+1
        ++x;
        System.out.println(("x=" + x));
        System.out.println("-----------------------");
        y--;
        --y;
        System.out.println("y=" + y);	
        System.out.println("-----------------------");
        z = x++; // x가 가지고 있던 12를 z에 대입후 x 는 1증가
        System.out.println(("z=" +z)); //12
        System.out.println(("x=" + x));//13
       
        System.out.println("-----------------------");
        z = ++x;  // 14로 증가된 내용을 z에 저장
        System.out.println(("z=" +z));  //14
        System.out.println(("x=" + x)); //14
        // x = 14 z= 14 y = 8
        System.out.println("-----------------------");
        z = ++x + y++;
		System.out.println("z=" + z); // 23
		System.out.println("x=" + x);//15
		System.out.println("y=" + y);// 9
    }
}
