package a1122.gettersetter;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee c = new Coffee("아메리카노", 3000);
        // 현재의 커피이름과 가격을 출력해 보세요
        System.out.printf("%s(%d원) ->", c.getName(), c.getPrice());
        // 가격을 500원 인상해 주세요
        c.setPrice(c.getPrice()+ 500); //500원 가격인상
        System.out.printf("인상된가격 %s(%d원)\n", c.getName(), c.getPrice()); 
    }
}
class Coffee{
    private String name; //직접 name 접근이 불가능 
    private int price;
   
    public String getName() { //Getter 값을 부를때 (사용할때)
        return name;
    }

    public void setName(String name) { //setter 값을 정할때
        this.name = name; 
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }
   

}
