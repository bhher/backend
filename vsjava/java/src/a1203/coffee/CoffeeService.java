package a1203.coffee;

import java.security.KeyStore.Entry;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.*;

public class CoffeeService {
    private boolean reOrder = false; //고객의 추가주문 여부
    private int orderNum =1; //고객주문번호
    public CoffeeService(){
        orderList = new LinkedHashMap<>();
    } //orderList : 고객주문 저장
    //LinkedHashMap<>()
    // 입력순서또는 접근순서 보장, 속도 :약간느림, 용도: 순서가중요한경우

    //커피 객체 준비
    Coffee coffee = Coffee.getInstance(); //커피메뉴 관리하는 싱글톤객체
    //손님 
    Customer customer;
    //지연클래스 준비
    Thread t = new Thread(); //아직 안배움
    Map<String, Integer> orderList;
    Scanner sc = new Scanner(System.in);
    public void start(){
        System.out.println("\n 어서오세요 연세IT커피숍입니다.");
        customer = new Customer(orderNum); //주문번화, 잔액(카드)
        coffee.getMenu(); //메뉴판
        //주문메소드
        order();
        totalOrder(customer);
        try {
            System.out.println("기다려 주시면 주문하신 음료가 나옵니다.");
            t.sleep(2000);
            end();
            } catch (Exception e) {
                e.printStackTrace();
            }
                    
            
               }
          //음료 결과                
        private void end() {
            int s = 1;
            StringBuffer message = new StringBuffer();
            message.append("\n\n ")
                    .append("+----------------------------------------------------+\n ")
                    .append("|                                                    | \n ")
                    .append("|           " + customer.getOrderName() + " 고객님 주문하신 음료 나왔습니다         | " + "\n");
            System.out.print(message);
            for (Map.Entry<String, Integer> order : customer.getCoffeeOrder().entrySet()) {
                System.out.printf(" | [%d] %-20s : %2d잔  %7s |\n", s, order.getKey(), order.getValue(), "");
                s++;
            }
            System.out.println(" |                                                    |");
            System.out.println(" +----------------------------------------------------+");
            
            }
            
            private void order() {
            System.out.println("\n 취소를 원하시면 0번을 눌러주세요");
            end:while(true){
                try{
                System.out.print("\n원하는시는 음료의 번호를 선택해주세요");
                String choice = sc.next();
                int choiceNum = Integer.parseInt(choice.substring(0,1));
                //한글자만 추출해서 숫자로변경
                if(choiceNum == 0){
                    System.out.println("주문을 취소합니다.");
                    System.exit(0); //빠져나감
                }
                sc.nextLine(); //입력된 불필요한 내용삭제
                String coffeeName = coffee.coffeeList.get(choiceNum-1);//주문번호 -1 = 인덱스번호
                System.out.println("선택하신음료는: "+ coffeeName + "입니다. 몇 잔 주문하시겠습니까?");    
                int orderCount = sc.nextInt();
                sc.nextLine();
                //재주문 if문
                if(reOrder){
                    for(String coff : orderList.keySet()){
                        if(coff.equals(coffeeName)){ //똑같은 커피를 시키면   
                            int addCount = orderList.get(coff).intValue() + orderCount;
                            //주문한 커피이름이 이미있으면 주문리스트의 수량을 불러서 현재 수량과 더한다.
                            orderList.replace(coffeeName,addCount); //변경한다.
                        }else{
                            orderList.put(coffeeName,orderCount);
                            break;
                        }
                    }    
                }else{
                   orderList.put(coffeeName, orderCount); //orderList (아메리카노, 3);
                }
                //추가주문 메소드
                addOrder();
                customer.setCoffeeOrder(orderList);
                break end;
            }catch(Exception e){
                System.out.println("잘못된 선택 입니다.");
                continue;
            }

            }
            
        }
        private void addOrder() {
            reOrder = false;
            System.out.println("\n주문을 계속하시겠습니까?");
            System.out.println("예(Y) / 아니요(N)");
            String yesOrNo = sc.next();
            if(yesOrNo.equals("예") || yesOrNo.equalsIgnoreCase("y")){
                coffee.getMenu();
                reOrder = true;
                order();
            }else if(yesOrNo.equals("아니오") || yesOrNo.equalsIgnoreCase("n")){
                return;
            }
        }

        //coffeeList - 커피이름  (리스트)
        //coffeePrice - 커피가격 (리스트)
        //menu 가  위의 두가지가 저장되있는 맵 menu(coffeeList,coffeePrice );
        //orderList(커피이름, 수량)
        private void totalOrder(Customer customer) {
             int s = 1;
             int totalMoney = 0;
             int coffeePrice = 0;
            DecimalFormat f = new DecimalFormat("###,000원");
            String name = customer.getOrderName() + "번 ";
            StringBuffer message = new StringBuffer();
            message.append("\n\n ")
            .append("+----------------------------------------------------+\n ")
            .append("|                                                    | \n ")
            .append("|             " + name + "고객님 의 주문 내역 입니다         | " + "\n");
            for(Map.Entry<String, Integer> order : customer.getCoffeeOrder().entrySet()){
                coffeePrice = coffee.menu.get(order.getKey()).intValue() * 
                customer.getCoffeeOrder().get(order.getKey()).intValue(); //수량
                //coffee.menu.get(order.getKey()) 커피의 이름을 키로 
                //가격을 값으로 갖는 map 객체 order.getKye() 해당커피의 가격
                totalMoney = totalMoney + coffeePrice;
                String pay = f.format(coffeePrice);
                message.append(String.format(" | [%d] %-20s : %2d잔  %7s |\n", s, order.getKey(), order.getValue(), pay));
                s++;

            }
            message.append(" |                                                    |\n ")
            .append("+----------------------------------------------------+ \n")
            .append(" ============ 총 결제 금액은 " + f.format(totalMoney) + "입니다 ========== \n");
            System.out.println(message);
            payment(totalMoney);
            
            
       
        }
            
            private void payment(int totalMoney) {
                System.out.println("\n 결재를 도와 드리겠습니다. 카드를 넣어주세요" );
                int payResult = customer.getMoney() - totalMoney;
                //고객이 카드잔액 - 청주문금액
                try{
                    t.sleep(2500);//2.5초있다 실행
                    System.out.println("결재중입니다.....");
                    t.sleep(2500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

                if(payResult < 0){
                    System.out.println("잔액이 부족합니다. 확인후 다시 주문해 주세요");
                    System.exit(0);
                }else{
                    customer.setMoney(payResult);
                    System.out.println("결제가 완료되었습니다.");
                    System.out.println("이용해주셔서 감사합니다.");
                    orderNum++; //다음 고객 번호 증가
                }
                //payment(int totalMoney) 는 고객의 잔액에서 총 주문 금액을 차감하고 결제
                //완료하는 기능 담당

            }




}
