package ch18.lecture.p01output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App05 {
    public static void main(String[] args) {

        String file = "C:/Temp/output5.data";

        // 예전 작성된 코드 스타일
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);

            os.write(3);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close(); // 꼭 해야함
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // try-with-resources 사용
        // try의 ()내에 닫을 stream을 선언하면
        //  java 가 자동으로 닫아 줌
        try (OutputStream os2 = new FileOutputStream(file);) {

            os2.write(3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // try-with-resources 사용
        // try의 ()내에 닫을 stream을 선언하면
        //  java 가 자동으로 닫아 줌
        try {
            OutputStream os3 = new FileOutputStream(file);
            try (os3) {

                os3.write(3);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}