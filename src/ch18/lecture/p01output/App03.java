package ch18.lecture.p01output;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App03 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("C:/Temp/output3.data");

        os.write(300);
        os.write(new byte[]{1, 2, 3, 4, 5}); // 5 bytes
        os.write(new byte[]{1, 2, 3, 4, 5}, 2, 3); // 2번 index부터 3개

        System.out.println("프로그램 종료");
    }
}
