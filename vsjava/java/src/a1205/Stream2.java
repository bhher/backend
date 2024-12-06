package a1205;

import java.util.Arrays;
import java.util.Comparator;

public class Stream2 {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        int[] result = Arrays.stream(data) //IntStream 생성
                .boxed() // IntStream을 Stream<Integer> 로 변경
                .filter((a) -> a % 2 == 0) //짜수를 뽑아낸다.                   
                .distinct() //중복제거
                .sorted(Comparator.reverseOrder())// 역순정렬
                .mapToInt(Integer::intValue) //Stream<Integer> ->IntStream
                .toArray()
                ;
        for(int num : result){
            System.out.println(num + " ");
        }       
        // 스트림 API의 특징
// 스트림 API는 다음과 같은 특징을 가집니다.


// 1. 스트림은 외부 반복을 통해 작업하는 컬렉션과는 달리 내부 반복(internal iteration)을 통해 작업을 수행합니다.

// 2. 스트림은 재사용이 가능한 컬렉션과는 달리 단 한 번만 사용할 수 있습니다.

// 3. 스트림은 원본 데이터를 변경하지 않습니다.

// 4. 스트림의 연산은 필터-맵(filter-map) 기반의 API를 사용하여
// 지연(lazy) 연산을 통해 성능을 최적화합니다.

// 5. 스트림은 parallelStream() 메소드를 통한 손쉬운 병렬 처리를 지원합니다. 
    }
}
