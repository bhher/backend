package a1120.class1;

public class CarEx {
    public static void main(String[] args) {
        //Car 객체 생성
        Car myCar1 = new Car();

        myCar1.company = "현대";
        myCar1.model = "제네시스";
        myCar1.color = "검정";
        myCar1.maxSpeed =  250;
        myCar1.speed =  70;

        System.out.println("제작회사 : " + myCar1.company);
        System.out.println("모델 : " + myCar1.model);
        System.out.println("색상 : " + myCar1.color);
        System.out.println("최고속도 : " + myCar1.maxSpeed);
        System.out.println("현재속도 : " + myCar1.speed);

        myCar1.speed = 60;
        System.out.println("수정된 속도: " + myCar1.speed);

        Car myCar2 = new Car("기아","투싼","쥐색",220,65);
        System.out.println("제작회사 : " + myCar2.company);
        System.out.println("모델 : " + myCar2.model);
        System.out.println("색상 : " + myCar2.color);
        System.out.println("최고속도 : " + myCar2.maxSpeed);
        System.out.println("현재속도 : " + myCar2.speed);

    }
}
