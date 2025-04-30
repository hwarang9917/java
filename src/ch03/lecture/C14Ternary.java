package ch03.lecture; // ch03.lecture라는 패키지에 속한 클래스입니다.

public class C14Ternary { // 클래스 이름: C14Ternary
    public static void main(String[] args) { // main 메서드: 프로그램 시작 지점

//        삼항연산자(Ternary)
//        조건연산자(Conditional)
//        형식: 항1 ? 항2 : 항3
//        해석: 항1이 true이면 항2 실행, false이면 항3 실행

        int r1 = true ? 3 : 5; // 조건 true → 3이 선택됨 → r1 = 3
        int r2 = false ? 9 : 11; // 조건 false → 11이 선택됨 → r2 = 11

        // 출력 결과:
        System.out.println("r1 = " + r1); // r1 = 3 출력
        System.out.println("r2 = " + r2); // r2 = 11 출력
    }
}
