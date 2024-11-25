package a1122;


class Car{
    String brand;
    String model;

    Car(){
        this("unknown", "Unknown"); //다른 생성자 호출
    }
    //매개변수 한개
    Car(String brand){
        this(brand, "Unknown");
    }
    //매개변수 두개
    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    void display(){
        System.out.println("Brand: " + brand + ",Model: " + model);
    }
}

public class CarEx {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota");   
        Car car3 = new Car("Honda", "Civic");
        car1.display();  // Brand: Unknown, Model: Unknown
        car2.display();// Brand: Toyota, Model: Unknown
        car3.display();// Brand: Honda, Model: Civic
    }
}
//this  현재 객체 자신을 참조

//this() 현재클래스의 다른 생성자 호출