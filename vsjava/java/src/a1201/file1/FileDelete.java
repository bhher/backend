package a1201.file1;

import java.io.File;
import java.io.IOException;

public class FileDelete {
    public static void main(String[] args) {
        try {
            File file =new File("newfile.txt");
            if(file.createNewFile()){
                System.out.println("파일생성 : "+ file.getName());
            }else{
                System.out.println("파일이미존재");
            }

                //파일 삭제
            if(file.delete()){
                System.out.println("파일이 삭제되었습니다.");
            }else{
                System.out.println("파일 삭제에 실패했습니다.");
            }    

        } catch (IOException e) {
            System.out.println("예외발생 : " +e.getMessage() );
        }
    }
}
