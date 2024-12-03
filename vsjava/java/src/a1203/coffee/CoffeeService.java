package a1203.coffee;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeService {
    private boolean reOrder = false; //고객의 추가주문 여부
    private int orderNum =1;
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
        customer = new Customer(orderNum);
        coffee.getMenu(); //메뉴판
        //주문메소드
        order();
        
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
                String coffeeName = coffee.coffeeList.get(choiceNum-1);
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
                   orderList.put(coffeeName, orderCount); 
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

}
