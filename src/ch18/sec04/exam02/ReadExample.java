package ch18.sec04.exam02;

import java.io.*;

public class ReadExample {
    public static void main(String[] args) {
        try {
            Reader reader = null;

//            1 문자씩 읽기
            reader = new FileReader("C:/Temp/test.txt");
            while (true) {
                int data = reader.read();
                if (data == -1) break;
                System.out.println((char) data);
            }
            reader.close();
            System.out.println();

//            문자 배열로 읽기
            reader = new FileReader("C:/Temp/test.txt");
            char[] data = new char[100];
            while (true) {
                int num = reader.read(data);
                if (num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}