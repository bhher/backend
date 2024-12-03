package a1203.coffee;

import java.util.Map;

public class Customer {
    private int orderName; //주문번호
    private Map<String, Integer> coffeeOrder; // 주문한 커피와 금액을 담을 map 선언
    
    public Map<String, Integer> getCoffeeOrder() {
        return coffeeOrder;
    }
    public void setCoffeeOrder(Map<String, Integer> coffeeOrder) {
        this.coffeeOrder = coffeeOrder;
    }

    private int money; //잔액
    public Customer(int s) {
        orderName = s;
        this.money = 300000;
    }
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getOrderName() {
        return orderName;
    }

    

}
