package ch05.sec07;

// 다차원 배열의 생성과 활용 예제
public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        // 2행 3열의 2차원 배열 선언 및 생성 (기본값 0으로 초기화)
        int[][] mathScores = new int[2][3];

        // 수학 점수 배열의 초기값 출력
        for (int i = 0; i < mathScores.length; i++) { // 행 반복
            for (int j = 0; j < mathScores[i].length; j++) { // 열 반복
                System.out.println("mathScores[" + i + "][" + j + "] = " + mathScores[i][j]);
            }
        }
        System.out.println();

        // 수학 점수 배열에 값 저장
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        // 수학 점수의 총합과 학생 수 계산
        int totalStudent = 0;
        int totalMathSum = 0;
        for (int i = 0; i < mathScores.length; i++) {
            totalStudent += mathScores[i].length; // 현재 반의 학생 수 더하기
            for (int j = 0; j < mathScores[i].length; j++) {
                totalMathSum += mathScores[i][j]; // 점수 합산
            }
        }

        // 수학 평균 계산 및 출력
        double totalMathAvg = (double) totalMathSum / totalStudent;
        System.out.println("전체 학생의 수학 평균 점수 " + totalMathAvg);
        System.out.println();

        // 가변 배열 생성: 각 반의 학생 수가 다름
        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2]; // 0번 반은 2명
        englishScores[1] = new int[3]; // 1번 반은 3명

        // 영어 점수 배열의 초기값 출력
        for (int i = 0; i < englishScores.length; i++) {
            for (int j = 0; j < englishScores[i].length; j++) {
                System.out.println("englishScores[" + i + "][" + j + "] = " + englishScores[i][j]);
            }
        }
        System.out.println();

        // 영어 점수 배열에 값 저장
        englishScores[0][0] = 90;
        englishScores[0][1] = 91;
        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        englishScores[1][2] = 94;

        // 영어 점수의 총합과 학생 수 계산
        totalStudent = 0;
        int totalEnglishSum = 0;
        for (int i = 0; i < englishScores.length; i++) {
            totalStudent += englishScores[i].length; // 현재 반의 학생 수 더하기
            for (int j = 0; j < englishScores[i].length; j++) {
                totalEnglishSum += englishScores[i][j]; // 점수 합산
            }
        }

        // 영어 평균 계산 및 출력
        double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
        System.out.println("전체 학생의 영어 평균 점수: " + totalEnglishAvg);
    }
}
