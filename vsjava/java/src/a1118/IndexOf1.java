package a1118;

public class IndexOf1 {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        int location = subject.indexOf("프로그래밍");
        //인덱스번호 3번에 '프로그래밍'발견되므로 3을 반환
        System.out.println(location);
        String subString= subject.substring(location);
        //인덱스번호 3번부터 끝까지 문자열 추출해서 subString변수에 넣어라
        System.out.println(subString);

        location = subject.indexOf("자바");
        //자바단어가 있으면 인덱스번호 반환 없으면 -1 반환
        if(location != -1){
            System.out.println("자바와 관련된 책이군요");
        } else{
            System.out.println("자바와 관련없는 책이군요");
        }

        boolean result = subject.contains("자바");
        System.out.println(result);
        if(result){
            System.out.println("자바와 관련된 책이군요");
        } else{
            System.out.println("자바와 관련없는 책이군요");
        }

    }
}
