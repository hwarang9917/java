package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        long var1 =10;
        long var2 =20L;
//        long var3 = 100000000000; (컴파일 에러 java: integer number too large)
//        underscore(underbar)로 자릿수 표시 가능
        long var4 = 100000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);

    }
}
