package a1201.file1;

import java.io.File;

public class DirectoryEx {
    public static void main(String[] args) {
         // 디렉토리 생성
        File directory = new File("testDir");

        if (directory.mkdir()) {
            System.out.println("디렉토리가 생성되었습니다: " + directory.getName());
        } else {
            System.out.println("디렉토리 생성에 실패했습니다.");
        }

        //디레토리 내파일 및 폴더 목록 출력
        File dir = new File(".");  //현재작업중인 디렉토리
        String[] list = dir.list(); //현재의 디레토리에 포함된 파일과 폴더이름을 문자열 배열에 반환
        if (list != null) {
            System.out.println("디렉토리 목록:");
            for (String fileName : list) {
                System.out.println(fileName);
            }
        }

    }
}
