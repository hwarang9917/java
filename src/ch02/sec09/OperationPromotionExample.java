package ch02.sec09;

public class OperationPromotionExample {
    public static void main(String[] args) {
        // 상수 간의 연산은 컴파일러가 미리 계산하므로 result1은 byte 범위 내의 값(30)으로 처리 가능
        byte result1 = 10 + 20; // 컴파일 단계에서 연산됨. 상수이기 때문에 byte 범위 안이면 오류 없음
        System.out.println("result1 = " + result1);

        byte v1 = 10;
        byte v2 = 20;
        // byte + byte 는 자동으로 int로 변환되어 연산됨 (Java의 기본 연산 단위는 int)
        int result2 = v1 + v2; // int 타입으로 변환 후 연산 (byte + byte -> int)
        System.out.println("result2 = " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        // 가장 큰 자료형(long)에 맞춰서 모두 long으로 자동 형변환된 후 연산
        long result3 = v3 + v4 + v5; // long 타입으로 변환 후 연산
        System.out.println("result3 = " + result3);

        char v6 = 'A'; // 유니코드 값 65
        char v7 = 1;
        // char + char 도 int로 변환 후 연산됨
        int result4 = v6 + v7; // int 타입으로 변환 후 연산 (65 + 1 = 66)
        System.out.println("result4 = " + result4); // 66 출력
        System.out.println("result4 = " + (char)result4); // 66에 해당하는 문자 'B' 출력

        int v8 = 10;
        int result5 = v8 / 4; // 정수 나눗셈이므로 결과는 몫만 남음 (10 / 4 = 2)
        System.out.println("result5 = " + result5);

        int v9 = 10;
        // 정수와 실수의 연산에서는 정수가 자동으로 실수(double)로 변환되어 연산됨
        double result6 = v9 / 4.0; // double 타입으로 변환 후 연산 (10 / 4.0 = 2.5)
        System.out.println("result6 = " + result6);

        int v10 = 1;
        int v11 = 2;
        // 명시적으로 v10을 double로 형변환하여 정수 나눗셈이 아닌 실수 나눗셈 수행
        double result7 = (double) v10 / v11; // (1.0 / 2 = 0.5)
        System.out.println("result7 = " + result7);
    }
}
