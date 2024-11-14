package a1113;

public class Over1 {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i=0; i<5;i++){
            var1++;
            System.out.println("var1: "+ var1);
        }
        System.out.println("-----------------------");

        byte var2 = -125;
		for(int i=0; i<5; i++) {	  		//{ }를 5번 반복 실행
			var2--;					      	//-- 연산은 var2의 값을 1 감소시킨다.
			System.out.println("var2: " + var2);
		}

    }
}
