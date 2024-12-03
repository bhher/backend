package a1201.file;

import java.io.IOException;
import java.io.InputStream;

public class Input2 {
    public static void main(String[] args)  throws IOException{
          InputStream in = System.in;
        int a;
        int b;
        int c;
        a = in.read();
        b = in.read();
        c = in.read();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //사용자가 입력한 문자인 a에 해당하는 아스키코드 97출력
        //InputStream 은 바이트 단위의 데이터를 읽어들이는 내장 클래스
        //1byte만 읽으므로 한글자만 입력
        // a 입력 엔터  끝남
        // a -> 97 엔터 13 출력 10 줄바꿈

        //abc 연속 입력
    }
}
