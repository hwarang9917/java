package ch04.sec03;

public class SwitchValueExample {
    public static void main(String[] args) {
        // grade 변수에 "B" 값을 할당
        String grade = "B";

        // JAVA 11 이전 문법 (기존 switch 문법)
        int score1 = 0;  // 점수를 저장할 변수

        // switch 문을 사용하여 grade에 맞는 점수를 계산
        switch(grade) {
            case "A":  // grade가 "A"일 경우
                score1 = 100;  // 점수는 100
                break;  // switch 문을 빠져나옴
            case "B":  // grade가 "B"일 경우
                int result = 100 - 20;  // 100에서 20을 빼서 result에 저장
                score1 = result;  // score1에 result 값 할당 (80)
                break;  // switch 문을 빠져나옴
            default:  // grade가 "A"나 "B"가 아닐 경우
                score1 = 60;  // 점수는 60
        }
        // 결과 출력
        System.out.println("score1 = " + score1);  // score1은 80이 출력됨


        // JAVA 13부터 가능 (switch 표현식)
        // Java 13 이상에서는 switch 문을 값으로 반환하는 표현식으로 사용할 수 있음
        int score2 = switch(grade) {  // grade 값에 따라 score2 계산
            case "A" -> 100;  // grade가 "A"일 경우 100을 반환
            case "B" -> {  // grade가 "B"일 경우
                int result = 100 - 20;  // 100에서 20을 빼서 result에 저장
                yield result;  // result 값을 반환 (yield 키워드 사용)
            }
            default -> 60;  // grade가 "A"나 "B"가 아닐 경우 60을 반환
        };
        // 결과 출력
        System.out.println("score2 = " + score2);  // score2는 80이 출력됨
    }
}
