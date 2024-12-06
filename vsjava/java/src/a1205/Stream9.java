package a1205;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//회원 (Member) 객체에 '남자' 회원의 평균 나이를 
//외부 반복자를 이용하는 방법과 , 내부 반복자 람다식 스트림을 적용하는
//방법으로 코딩하시오
public class Stream9 {
    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        Member m1 = new Member("박태호",Member.MALE,30);
        Member m2 = new Member("김연경",Member.FEMALE, 29);
        Member m3 = new Member("손유일", Member.MALE, 32);
        Member m4 = new Member("안재홍", Member.MALE, 27);
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        //1. 외부반복자 
        //index값을 사용 for문 과 if 문 남성 여성 구분 
        // 남성나이만 sum 누적
        // count 나눠서 남성평균나이 출력 

        int count =0;
        double sum = 0;
        for(int i=0; i< list.size();i++){
            if(list.get(i).getGender() == Member.MALE){
                sum = sum + list.get(i).getAge();
                count++;
            }
        }
        double ageAvg1 = sum / count;
        System.out.println("남성 평균 나이 :"+ageAvg1);

        //방법2. 내부반복자를 적용하여 해겨
        double ageAvg = list.stream()
            .filter(m -> m.getGender() == Member.MALE)
            .mapToInt(Member::getAge)
            .average()
            .getAsDouble()
            ;
        System.out.println("남자 회원의 평균 나이:  " +ageAvg);
    }
}
//1. list.stream() : 리스트를 스트림변환
//2. 성별이 남성인 회원만 필터링 -> 중간연산
//3. 회원객체를 나이로 매칭 - mapToInt 메서는 객체를 int 로 값으로 변환
//-IntStream을 생성
//4. average() -> 스트림요소들의 평균을 계산 -> 최종처리 집계 처리
//5. getAsDouble(): 평균값을 double 형태로 반환