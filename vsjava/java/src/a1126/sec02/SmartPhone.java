package a1126.sec02;

public class SmartPhone extends Phone {
    //부모인 phone 으로 부터  스마트폰이 필드와 메소드를 상속 받는다.
    //필드 선언
    public boolean wifi;

    //setter 메소드 
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }
    public void internet(){
        System.out.println("인터넷을 연결합니다.");
    }

    //생성자 선언
    public SmartPhone(String model, String color){
        this.model = model;
        this.color = color;
    }

}
