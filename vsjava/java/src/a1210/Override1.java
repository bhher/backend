import java.util.Scanner;

public class Override1 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("넓이 계산을 원하는 도형 유형을 선택해주세요");
        System.out.println("1. 원형\t2. 사각형\t3. 삼각형");
        int shape = scanner.nextInt();
        Shape shapeObject = null;

        switch (shape) {
            case 1:
                System.out.println("반지름을 입력하세요:");
                double radius = scanner.nextDouble();
                shapeObject = new Circle(radius);
                break;
            case 2:
                System.out.println("가로와 세로를 입력하세요:");
                double width = scanner.nextDouble();
                double height = scanner.nextDouble();
                shapeObject = new Rectangle(width, height);
                break;
            case 3:
                System.out.println("밑변과 높이를 입력하세요:");
                double base = scanner.nextDouble();
                height = scanner.nextDouble();
                shapeObject = new Triangle(base, height);
                break;
            default:
                System.out.println("잘못된입력입니다.");
                return;
        }

        double area = shapeObject.calculateArea();
        System.out.println(shapeObject.render + "의 넓이: " + area);
    }
}

abstract class Shape{
    String render;
    public abstract double calculateArea(); //추상메서드
}
class Circle extends Shape{
    private double radius;
    public Circle(double radius) {
        this.render = "circle";
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
class Rectangle extends Shape   {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height;
    }
    
}
class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

}