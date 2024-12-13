package a1212.Lotto;



public class Main {
    public static void main(String[] args) {
        Membership m = new Membership();
        m.membershipGuide();
        //로또를 구매
        Purchase p = new Purchase();
        p.perchaseQuestion(m);

        Loading l = new Loading();
        l.loading();

        //로또번호를 추첨한다.
        Lottery lt = new Lottery();

        //랜덤으로 로또 번호를 생성한다.
        lt.randomLotteryNum();

        //당첨된 로또번호를 출력한다.
        lt.lotteryNum();


        //당첨 결과 를 출력한다.
        lt.result(m , p); //가입된 회원객체와 로또구매 객체를 인수로 result 메서드에 실어보냄
    }
}
