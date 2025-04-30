package ch03.exercise; // 이 파일이 포함된 패키지명입니다. 보통 연습문제(ch03.exercise)에 속해 있습니다.

public class Exercise02 { // Exercise02 클래스 선언
    public static void main(String[] args) { // main 메서드: 프로그램 실행 시작 지점
        int score = 95; // 변수 score에 85 저장

        // score > 90 → 85 > 90 → false
        // !(score > 90) → !false → true
        // 따라서 삼항연산자는 "true ? '가' : '나'" 와 같게 되어 "가"가 선택됨
        String result = (!(score > 90)) ? "가" : "나";

        System.out.println(result); // 결과 출력: "가"
    }
}
