package ch04.sec02; // 이 클래스가 속한 패키지의 이름입니다.

public class IfNestedExample { // 클래스 이름: IfNestedExmaple (오타 있음 → IfNestedExample이 자연스럽습니다)
    public static void main(String[] args) {
        // Math.random() → 0.0 이상 1.0 미만의 난수
        // (int)(Math.random() * 20) → 0부터 19까지의 정수
        // +81 → 최종적으로 81부터 100까지의 정수 생성
        int score = (int)(Math.random() * 20) + 81;
        System.out.println("점수: " + score); // 생성된 점수를 출력

        String grade; // 학점을 저장할 문자열 변수

        // 첫 번째 조건: score가 90 이상일 때
        if(score >= 90) {
            // 중첩 if문: score가 95 이상이면 A+
            if(score >= 95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        } else {
            // 두 번째 조건: 85 이상 90 미만인 경우
            if(score >= 85) {
                grade = "B+";
            } else {
                grade = "B";
            }
        }

        // 최종 학점 출력
        System.out.println("학점: " + grade);
    }
}
