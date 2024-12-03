package a1203.coffee;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" world"); //기존의 객체수정
        System.out.println(sb.toString()); // "Hello World"
    }
}
// 주요 차이점 요약
// 불변성 vs 가변성:

// String은 불변(immutable) 객체입니다. 문자열을 수정하면 새로운 String 객체가 생성됩니다.
// StringBuffer는 가변(mutable) 객체입니다. 문자열을 직접 수정할 수 있습니다.
// 성능:

// 문자열을 자주 수정하거나 연결할 경우, String은 비효율적일 수 있습니다. 매번 새로운 객체를 생성하기 때문입니다.
// StringBuffer는 문자열을 수정할 때 기존 객체를 수정하므로 성능이 더 효율적입니다.
// 스레드 안전성:

// String은 불변이므로 스레드 안전(thread-safe)합니다. 여러 스레드가 동시에 String 객체를 사용해도 문제가 발생하지 않습니다.
// StringBuffer는 동기화(synchronized)-(순서대로) 를 통해 스레드 
// 안전성을 보장합니다. 여러 스레드가 동시에 StringBuffer 객체를 수정해도 안전하지만, 성능은 약간 저하될 수 있습니다.