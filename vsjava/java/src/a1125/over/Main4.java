package a1125.over;

public class Main4 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(3,4);
        int result2 = calculator.add(3,4,5);
                
    }
}
                
    class Calculator{
                
        public int add(int i, int j) {
            return i + j;
        }
        
        public int add(int i, int j, int k) {
            return i + j + k;
        }


}