package ch03.sec06;  // ch03.sec06 패키지에 속한 클래스임을 명시

public class CompareOperatorExample {
    public static void main(String[] args) {
        // 정수형 비교
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);  // 두 값이 같은지 비교 (true)
        boolean result2 = (num1 != num2);  // 두 값이 다른지 비교 (false)
        boolean result3 = (num1 <= num2);  // num1이 num2보다 작거나 같은지 비교 (true)
        System.out.println("result1 = " + result1);  // true 출력
        System.out.println("result2 = " + result2);  // false 출력
        System.out.println("result3 = " + result3);  // true 출력

        // 문자형 비교 (문자도 내부적으로는 정수로 저장되기 때문에 비교 가능)
        char char1 = 'A';  // 유니코드 65
        char char2 = 'B';  // 유니코드 66
        boolean result4 = (char1 < char2);  // 65 < 66 → true
        System.out.println("result4 = " + result4);  // true 출력

        // 정수형과 실수형 비교
        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);  // 자동 형변환 후 비교 → 1.0 == 1.0 → true
        System.out.println("result5 = " + result5);  // true 출력

        // float과 double 비교
        float num5 = 0.1f;  // float은 0.1을 정확히 표현 못 함
        double num6 = 0.1;  // double 역시 0.1을 정확히 표현 못 하지만 float과는 표현 방식이 다름
        boolean result6 = (num5 == num6);  // 정밀도 차이로 false
        boolean result7 = (num5 == (float)num6);  // double을 float으로 강제 변환하여 비교 → true
        System.out.println("result6 = " + result6);  // false 출력
        System.out.println("result7 = " + result7);  // true 출력

        // 문자열 비교
        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2));  // 문자열 내용이 같은지 비교 (false)
        boolean result9 = (! str1.equals(str2));  // 내용이 다르기 때문에 true
        System.out.println("result8 = " + result8);  // false 출력
        System.out.println("result9 = " + result9);  // true 출력
    }
}
