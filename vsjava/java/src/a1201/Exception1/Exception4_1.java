package a1201.Exception1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception4_1 {
    public static void main(String[] args) {
        //파일입출력
        //파일이 존재하지 않거나 읽기/쓰기 ㅣ권한이 없을 때 발생하는 예외
        try {
           
            File file = new File("example.txt");
            if(file.exists()){
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                
                String line;
                while((line = br.readLine()) != null){
                    System.out.println(line);
                } 
                br.close();
            }else{
                System.out.println("파일을 찾을 수 없습니다."+ file.getAbsolutePath());
            }
           
        } catch (FileNotFoundException e) {
            System.out.println("파일이 찾을 수 없습니다." + e.getMessage());
        }catch(IOException e){
            System.out.println("파일을 읽는 도중 오류가 발생했습니다. "+ e.getMessage());
        }
    }
}
