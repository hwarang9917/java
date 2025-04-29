package ch03.sec07; // 패키지 선언

public class LogicalOperatorExample {
    public static void main(String[] args) {

        int charCode = 'A';
        // 문자 'A'의 유니코드 값은 65
        // 테스트를 위해 'a'(97), '5'(53)로 바꿔볼 수 있음

        // (1) 대문자 범위 확인: 'A'(65) ~ 'Z'(90)
        if ((65 <= charCode) & (charCode <= 90)) {
            // 단일 & 사용: 양쪽 조건을 모두 **평가**함
            // charCode가 65이므로 참 → "대문자이군요." 출력
            System.out.println("대문자이군요.");
        }

        // (2) 소문자 범위 확인: 'a'(97) ~ 'z'(122)
        if ((97 <= charCode) & (charCode <= 122)) {
            // 현재 charCode는 65 → 거짓이므로 실행되지 않음
            System.out.println("소문자이군요.");
        }

        // (3) 숫자 문자 범위 확인: '0'(48) ~ '9'(57)
        if ((48 <= charCode) & (charCode <= 57)) {
            // 현재 charCode는 65 → 범위 밖이므로 실행되지 않음
            System.out.println("숫자이군요.");
        }

        // ----------------------------------------------------------

        int value = 6;
        // int value = 7; 로 바꿔 테스트 가능

        // (4) value가 2 또는 3의 배수인지 확인 (단일 | 사용)
        if ((value % 2 == 0) | (value % 3 == 0)) {
            // |는 양쪽 조건을 **모두 평가**함
            // value가 6이면: (6 % 2 == 0) → true, (6 % 3 == 0) → true → true 출력
            System.out.println("2 또는 3의 배수이군요.");
        }

        // (5) 위와 동일한 조건을 ||로 평가 (short-circuit OR)
        boolean result = (value % 2 == 0) || (value % 3 == 0);
        // ||는 앞 조건이 true면 뒤 조건을 **평가하지 않음**
        // 따라서 더 효율적임

        if (!result) {
            // result가 false일 경우 실행됨
            // 현재 value가 6이면 result는 true → 실행되지 않음
            System.out.println("2 또는 3의 배수가 아니군요.");
        }
    }
}
