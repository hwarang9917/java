package ch18.lecture.p03writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class App02 {
    public static void main(String[] args) throws IOException {
//        byte 단위
//        input stream, output stream으로
//        문자(ascii 코드 외)를 읽고 쓰는 게 불편

//        문자(character) 단위
//        reader writer가 추가

//        writer : 문자 단위 출력 스트림
        String fileName = "C:/Temp/writer02.txt";
        try (Writer writer = new FileWriter(fileName)) {
            writer.write('a');
            writer.write(97);
            writer.write('걸');
            writer.write(44152);
            writer.flush();
        }
        System.out.println("파일 쓰기 완료");
    }
}
