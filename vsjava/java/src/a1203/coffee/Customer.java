package a1203.coffee;

import java.util.Map;

public class Customer {
    private int orderNum; //고객의 주문번호
    private int money; //고객이 가지고 있는 돈을 저장
   
    private Map<String,Integer> coffeeOrder;
    //고객이 주문한 커피의 종류와 수량저장하는 맵
    // 아메리카노 2
    //아이스아메리카노 3

    public int getOrderNum() {
        return orderNum;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public String getOrderName(){ //고객1 , 고객2 처럼 고객주문이름 반환
        return "고객 "+ orderNum;
    } //보류

    

    public void setCoffeeOrder(Map<String, Integer> coffeeOrder) {
        this.coffeeOrder = coffeeOrder;
    }

    public Map<String, Integer> getCoffeeOrder() {
        return coffeeOrder;
    }
 //고객의 주문번호를 받아 고객이 가지고 있는돈  초기화
    public Customer(int orderNum) {
        this.orderNum = orderNum;
        this.money = 20000;
    }

    

}
