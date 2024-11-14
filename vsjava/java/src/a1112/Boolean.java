package a1112;

public class Boolean {
    public static void main(String[] args) {
        boolean stop = true;
        if(stop){
            System.out.println("중지합니다.");
        }else{
            System.out.println("시작합니다.");
        }
        int x = 10;
        boolean result1 = (x == 20); //변수값이 20이냐?
        boolean result2 = (x != 20); //변수값이 20아니냐?
        System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
    }

    public static boolean parseBoolean(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'parseBoolean'");
    }
}
