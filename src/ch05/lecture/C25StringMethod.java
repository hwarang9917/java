package ch05.lecture;

public class C25StringMethod {
    public static void main(String[] args) {
//        substring : 부분 문자열 추출
        String a = "hello world java programming";
        String b = a.substring(6, 10);
        System.out.println("b: " + b);
        String c = a.substring(6, 11);
        System.out.println("c = " + c);

//        programm 추출 연습
        String d = a.substring(17, 25);
        System.out.println("d = " + d);

//        시작값만 주면 끝까지 추출
        String e = a.substring(17);
        System.out.println("e = " + e);
    }
}
