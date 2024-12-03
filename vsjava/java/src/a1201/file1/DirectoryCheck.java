package a1201.file1;

import java.io.File;

public class DirectoryCheck {
    public static void main(String[] args) {
        File dir = new File("testDir");
        if(dir.exists() && dir.isDirectory()){
            String[] list = dir.list();
            if(list !=null){
                for(String fileName : list){
                    File file = new File(dir, fileName);
                    if(file.isFile()){
                        System.out.println("파일:" + fileName);
                    }else if(file.isDirectory()){
                        System.out.println("디렉토리:" + fileName);
                    }
                }
            }else{
                System.out.println("디렉토리가 존재하지 않습니다.");
            }

        }

    }
}
//File 클래스 메소드
// exists(): 파일 또는 디렉토리가 존재하는지 확인
// isDirectory(): 디렉토리인지 확인
// isFile(): 파일인지 확인
// getName(): 파일 또는 디렉토리 이름 반환
// getAbsolutePath(): 절대 경로 반환
// length(): 파일 크기 반환
// lastModified(): 마지막 수정 시간 반환
// mkdir(): 디렉토리 생성
// mkdirs(): 중첩된 디렉토리 생성
// delete(): 파일 또는 디렉토리 삭제