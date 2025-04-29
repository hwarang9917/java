package ch03.sec02;

// 산술 연산자(+, -, *, /, %) 사용 예제
public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        byte v1 = 10;    // byte 타입 변수 v1에 10 저장
        byte v2 = 4;     // byte 타입 변수 v2에 4 저장
        int v3 = 5;      // int 타입 변수 v3에 5 저장 (사용되진 않음)
        long v4 = 10L;   // long 타입 변수 v4에 10 저장 (L은 long 리터럴 표시)

        // byte 타입끼리 연산하면, 자바는 자동으로 둘 다 int 타입으로 변환한 후 연산함
        int result1 = v1 + v2;
        System.out.println("result1: " + result1); // 10 + 4 = 14 출력

        // v1, v2는 int 타입으로 변환된 후 연산되고, v4는 long 타입이므로
        // int끼리 더한 결과를 long 타입인 v4와 연산하면 결과는 long 타입으로 자동 변환됨
        long result2 = v1 + v2 - v4;
        System.out.println("result2 = " + result2); // (10 + 4) - 10 = 4 출력

        // v1을 double 타입으로 강제 변환(casting)한 후 v2로 나누기
        // 따라서 결과는 정수 나눗셈이 아닌 실수 나눗셈이 되어 소수점 이하까지 계산
        double result3 = (double) v1 / v2;
        System.out.println("result3 = " + result3); // 10.0 / 4 = 2.5 출력

        // 나머지 연산자 % : v1을 v2로 나눈 나머지를 구함
        int result4 = v1 % v2;
        System.out.println("result4 = " + result4); // 10 % 4 = 2 출력
    }
}
