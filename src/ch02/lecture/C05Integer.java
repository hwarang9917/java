package ch02.lecture;

public class C05Integer {
    public static void main(String[] args) {
//        정수형
//        byte(1 byte 8bits)
        byte a; // a byte 타입
        a = 127; // 최댓값
        System.out.println("a = " + a);
        a = -128; // 최솟값
        System.out.println("a = " + a);
//        a = 128; // x
//        a = -129; // x

//        short(2 bytes 16bits)
        short b; // b 숏타입
        b = 32767;
        System.out.println("b = " + b);
        b = -32768;
        System.out.println("b = " + b);

//        int(4 bytes 32bits)
        int c; // c int 타입
        c = 2147483647;
        System.out.println("c = " + c);
        c = -2147483648;
        System.out.println("c = " + c);


//        long(8 bytes 64bits)
        long d;// d 롱타입
        d = 9223372036854775807L;
        System.out.println("d = " + d);
        d = -9223372036854775808L;
        System.out.println("d = " + d);

//        java 코드에서 정수 literal 는 int로 해석
//        long type literal 은 끝에 L(l) 붙여야 함

    }
}
