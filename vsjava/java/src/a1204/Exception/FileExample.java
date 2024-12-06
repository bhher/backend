package a1204.Exception;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class FileExample {
    public static void main(String[] args) {
        String filePath = "c:\\example.txt";
        //파일생성
        createFile(filePath);
        //파일에 내용쓰기
        writeFile(filePath,"파일쓰기 연습할꺼에요");
        readFile(filePath);

    }

    private static void readFile(String filePath) {
        try(FileReader reader= new FileReader(filePath);
            BufferedReader br = new BufferedReader(reader)){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("파일일기중 오류"+ e.getMessage());
        }
    }

    private static void writeFile(String filePath, String content) {
        try(FileWriter writer= new FileWriter(filePath)){
            writer.write(content);
            System.out.println("파일내용이 작성되었습니다.");
        }catch(IOException e){
            System.out.println("파일쓰기중 오류"+ e.getMessage());
        }
    }

    //파일 생서메서드
    private static void createFile(String filePath) {
      File file = new File(filePath);
      try{
        if (file.createNewFile()) {
            System.out.println("파일이 생성되었습니다: " + file.getName());
        } else {
            System.out.println("파일이 이미 존재합니다.");
        }
      }catch(IOException e){
          System.out.println("파일 생성중 오류가 났어요"+e.getMessage());  
      }
    }
    
}
