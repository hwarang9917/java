package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    public static void main(String[] args) {
        try {
            try (OutputStream os = new FileOutputStream("C:/Temp/test1.db")) {

                byte a = 10;
                byte b = 20;
                int c = 300000000;

                os.write(a);
                os.write(b);
                os.write(c);

                os.flush();
//                os.close(); // try-with-resources -> 자동 close -> 지워도 됨
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
