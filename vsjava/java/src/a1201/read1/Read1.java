package a1201.read1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read1 {
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("c:/abc/out3.txt"));
        while (true) {
            String line = br.readLine();
            if(line==null) break;  //더이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            System.out.println(line);
        }
    }
}
