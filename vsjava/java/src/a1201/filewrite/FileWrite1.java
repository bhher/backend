package a1201.filewrite;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("c:/abc/out.txt");
        output.close();
    }
}
