package ch11.sec02.exam02;

import ch07.exercise.p12.C;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("나머지 코드");
        System.out.println();

        try {
            Class.forName("java.lang.String2");
            System.out.println("클래스가 역시 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("또 나머진 코드");
    }
}