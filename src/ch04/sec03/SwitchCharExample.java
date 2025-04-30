package ch04.sec03;

public class SwitchCharExample {
    public static void main(String[] args) {
        // grade 변수를 'B'로 초기화
        // 이 값은 switch 문에서 검사할 대상이 됩니다.
        char grade = 'B';

        // switch 문: grade 값에 따라서 다른 메시지를 출력
        switch (grade) {
            // 'A' 또는 'a'가 입력된 경우 실행되는 부분
            case 'A':  // 'A'일 경우
            case 'a':  // 'a'일 경우 (대소문자 구분 없이 동일한 처리)
                System.out.println("우수 회원입니다.");
                break;  // 실행 후 switch문을 빠져나옵니다.

            // 'B' 또는 'b'가 입력된 경우 실행되는 부분
            case 'B':  // 'B'일 경우
            case 'b':  // 'b'일 경우 (대소문자 구분 없이 동일한 처리)
                System.out.println("일반 회원입니다.");
                break;  // 실행 후 switch문을 빠져나옵니다.

            // 'C' 또는 'c'가 입력된 경우 실행되는 부분
            case 'C':  // 'C'일 경우
            case 'c':  // 'c'일 경우 (대소문자 구분 없이 동일한 처리)
                System.out.println("손님입니다.");
                // break 문이 없어서 switch문 끝까지 실행됩니다.
        }
    }
}
