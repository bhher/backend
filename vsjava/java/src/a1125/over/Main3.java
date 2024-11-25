package a1125.over;

public class Main3 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");
    }
}

class Printer{
    public void println(int value){
        System.out.println(value);
    }
    public void println(boolean value){
        System.out.println(value);
    }
    public void println(double value){
        System.out.println(value);
    }
    public void println(String value){
        System.out.println(value);
    }
    //println() 메서드를 각각 int , boolean, double,String 타입데 대해 
    //오버로딩하여 선언

}