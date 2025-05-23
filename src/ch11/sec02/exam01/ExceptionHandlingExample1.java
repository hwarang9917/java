package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void main(String[] args) {
        printLength("thisisjava");
        printLength(null);
        System.out.println("프로그램 종료");
    }

    public static void printLength(String data) {
        int length = data.length();
        System.out.println("length = " + length);
    }
}