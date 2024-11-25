package a1122.Shopping;

public class ProductEx {
    public static void main(String[] args) {
        Product laptop = new Product("노트북", 1200000, 10);
         Product desktop = new Product("데스크톱", -1000000, -5);

        // System.out.println("제품명 :"+ laptop.getName());
        // System.out.println("가격 :"+ laptop.getPrice());
        // System.out.println("재고 :"+ laptop.getStock());
        System.out.println(laptop.toStr());
        System.out.println(desktop.toStr());
        //가격 수정
        //laptop.setPrice(-500); //세터로 가격수정
        //System.out.println("수정된 가격 " + laptop.getPrice());

        //재고 추가 메소드
        laptop.addStock(5);

        //상품 판매
        laptop.sellProduct(8);

    }
}
