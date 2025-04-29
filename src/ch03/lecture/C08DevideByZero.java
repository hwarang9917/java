package ch03.lecture;

public class C08DevideByZero {
    public static void main(String[] args) {

//    0으로 나누기
    int a = 5;
    int b = 0;

//    정수타입은 0으로 나눌 수 없음
//    int c = a / b;
//    System.out.println("c = " + c);

//    실수타입은
    double c = 5.0;
    double d = 0.0;

//    실수타입은 0으로 나누면 Infinity
    double e = c / d;
        System.out.println("e = " + e);

//        실수타입을 0으로 나눈 나머지는 존재하지 않음(Not a Number)
        double f = c % d;
        System.out.println("f = " + f);

//        Double.isInfinity() : 값이 Infinity인지 확인하는 메소드
//        Double.isNaN() : 값이 NaN인지 확인하는 메소드
        System.out.println("Double.isInfinity(e) = " + e);
        System.out.println("Double.isInfinity(f) = " + f);
    }
}
