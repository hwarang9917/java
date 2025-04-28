package ch02.sec03;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A'; // 문자 저장
        char c2 = 65; // 10진법 코드 직접 저장
        char c5 = '\u0041'; // 유니코드

        char c3 = '가'; // 문자 저장
        char c4 = 44032; // 유니코드 직접 저장
        char c6 = '\uAC00';

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        System.out.println("c5 = " + c5);
        System.out.println("c6 = " + c6);
    }
}
