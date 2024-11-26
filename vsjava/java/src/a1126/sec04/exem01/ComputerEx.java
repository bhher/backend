package a1126.sec04.exem01;

public class ComputerEx {
    public static void main(String[] args) {
        int r = 10;
        Calculator calculator = new Calculator();
        System.out.println("원면적:"+ calculator.areaCircle(r));
        Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));

    }
}
