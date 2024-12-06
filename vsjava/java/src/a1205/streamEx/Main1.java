package a1205.streamEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
           new Transaction(brian, 2011, 300)
           , new Transaction(raoul, 2012, 1000)
           , new Transaction(raoul, 2011, 400)
           , new Transaction(mario, 2012, 700)
           , new Transaction(mario, 2012, 700)        
           , new Transaction(alan, 2012, 950)
        );
        //brian , mario 거래자  //Cambridge 거래자근무하는도시
        //1.문제 2011년에 일어나 모든 트랜재션을 찾아 오름차순으로 정렬하시오
        practice1(transactions);
        //2.거래자가 근무하는 모든 도시를 중복없이 나열하시오
        practice2(transactions);
        //3. 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
        practice3(transactions);
        //밀라노엔 거래자가 있는가?
        practice4(transactions);        
         //케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오.     
        practice5(transactions); 
        
        //모든 거래자의 이름을 알파벳 순으로 정렬해서 반환하시오
        practice6(transactions); 
        //최대값
        practice7(transactions); 
        practice8(transactions); 
        
        }

//전체 트랜잭션 중 최댓값은 얼마인가?
    private static void practice7(List<Transaction> transactions) {
        Optional<Transaction> result1 = transactions.stream()
            .max(Comparator.comparing(Transaction::getValue));
            //Optional null이어도 에러없음
        System.out.println(result1); //최대값 객체전체가 toString에 의해 나옴 
    }
    //전체 트랜잭션 중 최소값은 얼마인가?
    private static void practice8(List<Transaction> transactions) {
        Optional<Transaction> result = transactions.stream()
            .min(Comparator.comparing(Transaction::getValue));

        System.out.println(result.get().getValue());  
    }


           //모든 거래자의 이름을 알파벳 순으로 정렬해서 반환하시오
        private static void practice6(List<Transaction> transactions) {
            String  result = transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted() //호출할 때 아무 변수도 전달하지 않으면 기본적으로 전달
                .collect(Collectors.joining(","));
                System.out.println(result); //최종결과
        }              
                        
                //케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오.
             private static void practice5(List<Transaction> transactions) {
            List<Transaction> result = transactions.stream()
                .filter(tran ->"Cambridge".equals(tran.getTrader().getCity()))
                .collect(Collectors.toList());
                System.out.println(result);
        }
        
        
        
        
            private static void practice4(List<Transaction> transactions) {
    boolean result = transactions.stream()
        .anyMatch(tran -> "Milan" .equals(tran.getTrader().getCity()));
        System.out.println(result);
        
}
        
            //3. 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정령하시오
    private static void practice3(List<Transaction> transactions) {
        List<Trader> result = transactions.stream()
        .map(Transaction::getTrader)
        .filter(trader -> ("Cambridge").equals(trader.getCity()))
        .distinct()
        .sorted(Comparator.comparing(Trader::getName))
        .collect(Collectors.toList());
           
         System.out.println(result); //최종결과
    }
        
        
            //2.거래자가 근무하는 모든 도시를 중복없이 나열하시오
    private static void practice2(List<Transaction> transactions) {
        List<String> result = transactions.stream()
        .map((tran) ->tran.getTrader().getCity())
        .distinct()
        .collect(Collectors.toList());  
        System.out.println(result);
    }
           //tran(transactions) 객체를 입력받아서 
            //.map(Transaction::getTrader) //각 거래에서 거래자 객체를 추출
            //.map(Trader::getCity) //각 거래자에서 도시정보추출
        
        
            //1.2011년에 일어나 모든 트랜재션을 찾아 오름차순으로 정렬하시오    
    private static void practice1(List<Transaction> transactions) {
       List<Transaction> result = transactions.stream()
       .filter(transaction -> 2011 == transaction.getYear())
       .sorted(Comparator.comparing(Transaction::getValue))
       .collect(Collectors.toList());
       System.out.println(result);
     //.sorted(Comparator.comparing(Transaction::getValue).reversed())//내림차순
    //.sorted((tran1, tran2) -> Integer.compare(tran1.getValue(), tran2.getValue()))

    }
}