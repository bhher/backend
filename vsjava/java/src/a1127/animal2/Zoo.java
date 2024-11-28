package a1127.animal2;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal[] animals = new Animal[3]; // 최대 3마리 동물 관리
        int index = 0;

        while(true){
            if(index == animals.length) break; //배열이 꽊차면 종료

            System.out.println("1. 개   2. 새  3. 물고기 ");
            System.out.print("입력>>");
            String input = sc.next();

            if(input.equals("그만")) break;

            System.out.print("이름입력>>");
            String name = sc.next();
            System.out.print("나이입력>>");
            int age = sc.nextInt();

            switch(input){
                case "1" :
                    animals[index++] = new Dog(name, age); //배열에 Dog객체 저장
                    break;
                case "2" :
                    animals[index++] = new Bird(name, age); //배열에 Bird객체 저장
                    break;
                case "3" :
                    animals[index++] = new Fish(name, age); //배열에 Fish객체 저장
                    break;    
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                    break;
            }

        }
        System.out.println("=======동물 정보===========");
        for(Animal animal : animals){
            //배열의 단점 : 배열총갯수를 정해야함
            if (animal == null) continue; //비어 있으면 건너뜀
            animal.info();
            animal.sound();
            animal.move();
            System.out.println();

        }


    }
}
