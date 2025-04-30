package ch04.exercise;

public class Exercise03While {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

//        while문 활용 1~100 정수 3의 배수 총합 출력
//        알고리즘
//        1.1~100 정수 -> int i로 계산
//        2.3의 배수 -> i % 3 == 0 인 경우 sum i++
//        3.아닌 경우 제외
        while (i <= 100) {
            if (i % 3 == 0) {
                sum += i;
            }
                i++;
        }
            System.out.println("3의 배수의 합:" + sum);
    }
}
