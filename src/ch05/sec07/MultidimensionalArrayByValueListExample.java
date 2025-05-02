package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        // 2차원 배열 생성 및 초기화
        // 각 중괄호 블록은 하나의 반(1차원 배열), 내부 요소는 각 학생의 점수
        int[][] scores = {
                {80, 90, 96}, // 첫 번째 반 (학생 3명)
                {76, 88}      // 두 번째 반 (학생 2명)
        };

        // 배열의 길이 출력
        System.out.println("1차원 배열 길이(반의 수): " + scores.length); // 2 (반이 2개)
        System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): " + scores[0].length); // 3
        System.out.println("2차원 배열 길이(두 번째 반의 학생 수): " + scores[1].length); // 2

        // 특정 학생의 점수 출력
        System.out.println("scores[0][2]: " + scores[0][2]); // 첫 번째 반의 세 번째 학생 점수 (96)
        System.out.println("scores[1][1]: " + scores[1][1]); // 두 번째 반의 두 번째 학생 점수 (88)

        // 첫 번째 반의 평균 점수 계산
        int class1Sum = 0;
        for (int i = 0; i < scores[0].length; i++) {
            class1Sum += scores[0][i]; // 각 학생 점수를 더함
        }
        double class1Avg = (double) class1Sum / scores[0].length; // 평균 = 총합 / 인원수
        System.out.println("첫 번째 반의 평균 점수: " + class1Avg);

        // 두 번째 반의 평균 점수 계산
        int class2Sum = 0;
        for (int i = 0; i < scores[1].length; i++) {
            class2Sum += scores[1][i];
        }
        double class2Avg = (double) class2Sum / scores[1].length;
        System.out.println("두 번째 반의 평균 점수: " + class2Avg);

        // 전체 학생의 평균 점수 계산
        int totalStudent = 0; // 전체 학생 수
        int totalSum = 0;     // 전체 점수 합계

        for (int i = 0; i < scores.length; i++) { // 모든 반을 순회
            totalStudent += scores[i].length; // 각 반의 학생 수를 누적
            for (int k = 0; k < scores[i].length; k++) { // 해당 반의 모든 학생 순회
                totalSum += scores[i][k]; // 각 학생 점수를 누적
            }
        }
        double totalAvg = (double) totalSum / totalStudent; // 전체 평균 계산
        System.out.println("전체 학생의 평균 점수: " + totalAvg);
    }
}
