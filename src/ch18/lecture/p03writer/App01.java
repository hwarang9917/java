package ch18.lecture.p03writer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class App01 {
    public static void main(String[] args) throws IOException {
        try (OutputStream os = new FileOutputStream("C:/Temp/writer01.txt")) {
            os.write(97);
            os.write(100);
            os.write(103);
            os.write(33);

            os.write('t'); // 아스키코드 t
            os.write('걸'); // 유니코드 AC78 -> 0078 -> x

            os.flush();
        }
    }
}
