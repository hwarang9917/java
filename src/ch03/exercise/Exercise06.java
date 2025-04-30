package ch03.exercise; // 이 파일이 속한 패키지 이름입니다. 보통 연습문제나 챕터별로 구분할 때 사용합니다.

public class Exercise06 { // Exercise06 클래스 정의 시작
    public static void main(String[] args) { // main 메서드: 프로그램의 시작점
        int x = 10; // 변수 x에 10을 저장
        int y = 5;  // 변수 y에 5를 저장

        // 첫 번째 출력문
        // (x > 7) → 10 > 7 → true
        // (y <= 5) → 5 <= 5 → true
        // true && true → true
        System.out.println((x > 7) && (y <= 5)); // 결과: true 출력

        // 두 번째 출력문
        // (x % 3 == 2) → 10 % 3 == 2 → 1 == 2 → false
        // (y % 2 != 1) → 5 % 2 != 1 → 1 != 1 → false
        // false || false → false
        System.out.println((x % 3 == 2) || (y % 2 != 1)); // 결과: false 출력
    }
}
