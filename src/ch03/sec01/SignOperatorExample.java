package ch03.sec01; // 패키지 선언 (ch03.sec01이라는 이름의 패키지에 속함)

public class SignOperatorExample { // 클래스 선언
    public static void main(String[] args) { // main 메서드: 자바 프로그램의 시작점
        int x = -100; // 정수형 변수 x 선언과 동시에 -100으로 초기화
        x = -x;       // x에 부호 연산자(-)를 적용 => -(-100)이므로 100이 됨
        System.out.println("x = " + x); // 결과 출력: x = 100

        byte b = 100; // 바이트형 변수 b 선언과 동시에 100으로 초기화
        int y = -b;   // 부호 연산자(-)를 b에 적용하면 결과는 int형이 됨 (자동 타입 변환 발생)
        System.out.println("y = " + y); // 결과 출력: y = -100
    }
}
