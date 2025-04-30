package ch04.exercise;

public class Exercise04 {
    public static void main(String[] args) {
        /* while, Math.random()
        주사위 두 개 (눈1, 눈2)
        눈의 합 5가 아니면 던지고
        5면 실행 멈추기*/

        int dice1, dice2, sum;

        do {
            // 주사위 던지기
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            sum = dice1 + dice2;

            // 주사위 눈과 합 출력
            System.out.println("눈1 = " + dice1 + ", 눈2 = " + dice2);
            System.out.println("눈의 합 = " + sum);

            if (sum == 5) {
                System.out.println("성공!");
                break;  // 합이 5이면 성공 메시지를 출력하고 루프 종료
            }

        } while (sum != 5);  // 눈의 합이 5가 아닐 경우 계속 던짐

        System.out.println("다시 도전.");
    }
}
