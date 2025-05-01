package ch04.exercise;

public class Exercise06 {
    public static void main(String[] args) {
        // 첫 번째 반복문은 행을 출력하는 반복문입니다.
        // 1부터 5까지 반복하여 총 5개의 행을 출력합니다.
        for (int i = 1; i <= 5; i++) {

            // 두 번째 반복문은 각 행에 별을 출력하는 반복문입니다.
            // j는 1부터 i까지 반복하여 현재 행에 맞는 개수의 '*'를 출력합니다.
            for (int j = 1; j <= i; j++) {

                // '*'을 출력합니다.
                System.out.print("*");

                // 만약 j가 i와 같다면, 즉 한 행의 별을 모두 출력했다면
                if (j == i) {
                    // 다음 줄로 이동하여 새로운 행을 시작합니다.
                    System.out.println();
                }
            }
        }
    }
}
