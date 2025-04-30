package ch04.sec03;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        // grade 변수에 'B'를 할당
        char grade = 'B';

        // switch 표현식 (블록 스타일)
        switch (grade) {
            // 'A' 또는 'a'일 경우 실행되는 블록
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다");
            }
            // 'B' 또는 'b'일 경우 실행되는 블록
            case 'B', 'b' -> {
                System.out.println("일반 회원입니다");
            }
            // 'A', 'B' 외의 값일 경우 실행되는 블록
            default -> {
                System.out.println("손님입니다.");
            }
        }

        // switch 표현식 (표현식 스타일)
        // 중괄호 안 실행문이 하나일 경우 중괄호 생략 가능
        switch (grade) {
            // 'A' 또는 'a'일 경우 실행
            case 'A', 'a' -> System.out.println("우수 회원입니다.");
            // 'B' 또는 'b'일 경우 실행
            case 'B', 'b' -> System.out.println("일반 회원입니다.");
            // 'A', 'B' 외의 값일 경우 실행
            default -> System.out.println("손님입니다");
        }
    }
}
