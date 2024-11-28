package a1127.shape;

public class Circle extends Shape {

    double radius; //반지름 변수
    
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(0);
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI *radius * radius ;
    }

    @Override
    double round() {
        // 2 X (원주율) X (반지름)
        return 2 * Math.PI * radius ;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
       


}
