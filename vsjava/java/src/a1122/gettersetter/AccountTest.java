package a1122.gettersetter;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(1000);
        System.out.printf("잔액 : %d", acc.getBalance() );
    }
}
class Account  {
   private int balance;

public int getBalance() {
    return balance;
}

public void setBalance(int balance) {
    this.balance = balance;
}
  
  
}
