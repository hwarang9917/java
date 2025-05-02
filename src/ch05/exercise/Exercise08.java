package ch05.exercise;

public class Exercise08 {
    public static void main(String[] args) {
//        전체 합과 평균출력하는 코드 작성 (중첩 for문 이용)

        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int[][] scores = array;


//        1반 2명 합, 평균

//        2반 3명 합, 평균

//        3반 5명 합, 평균

//        학생 전체 합, 평균
        int totalSum = 0;
        double totalAvg = 0.0;

        int count = 0;
        for (int i = 0; i < scores.length; i++) { // 모든 반을 순회
            for (int k = 0; k < scores[i].length; k++) { // 해당 반의 모든 학생 순회
                totalSum += scores[i][k]; // 각 학생 점수를 누적
                count++;
            }
        }
        System.out.println("전체 합: " + totalSum);
        totalAvg = (double) totalSum / count; // 전체 평균 계산
        System.out.println("전체 학생의 평균 점수: " + totalAvg);

    }

}

