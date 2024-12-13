package a0813.lotto1;



public class Main {
    public static void main(String[] args) {
        Membership m = new Membership();
        m.membershipGuide();

        // 로또를 구매
        Purchase p = new Purchase();
        p.purchaseQuestion(m);

        Loading l = new Loading();
        l.loading();

        // 로또 번호를 추첨한다.
        Lottery lt = new Lottery();

        // 랜덤으로 로또 번호를 생성한다.
        lt.randomLotteryNum();

        // 당첨된 로또 번호를 출력한다.
        lt.lotteryNum();

        // 당첨 결과를 출력한다.
        lt.result(m, p);

    }
}
