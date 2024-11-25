package a1122;

public class final1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        car.display();
        //car.brand = "Honda"; 오류 : final 필드는 재할당할 수없다.
        //car.display();
    }
}

class Car{
     final String brand; //final 필드선언
     final String model;
     //final : 객체마다 고유하지만 한 번만 초기화후 변경할 수 없는데이터
     //static final 상수 클래스 차원에서 모든 객체가 공유하며,
     //변경할 수 없는 고정데이터
     // static final double PI = 3.14159;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    } 
    void display(){
        System.out.println("Brand: "+ brand + ", Model: " + model);
    }

}


