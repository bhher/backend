package a1126.sec03;

public class SmartPhoneEx {
    public static void main(String[] args) {
        //SmartPhone 객체생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        //Phone으로 부터 상속 받은 필드 읽기
        System.out.println("모델: "+ myPhone.model);
        System.out.println("색상: " + myPhone.color);

        //SmartPhone의 필드읽기
        System.out.println("와이파이 상태: " + myPhone.wifi);
        //boolean 초기값은 false;

        //Phone 으로 부터 상속 받은 메소드 호출
        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		myPhone.sendVoice("아~ 네 반갑습니다.");
		myPhone.hangUp();

        //SmartPhone의 메소드 호출
        myPhone.setWifi(true);
        myPhone.internet();
        System.out.println("와이파이 상태: " + myPhone.wifi);
    }
}
