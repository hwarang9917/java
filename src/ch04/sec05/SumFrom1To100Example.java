package ch04.sec05;  // 패키지 선언

public class SumFrom1To100Example {  // 클래스 선언
    public static void main(String[] args) {  // main 메서드 - 프로그램의 진입점
        int sum = 0;  // 합계를 저장할 변수 sum을 0으로 초기화

        int i = 1;  // 반복문에서 사용할 변수 i를 1로 초기화

        // while 문은 i가 100 이하일 동안 반복
        while (i <= 100) {
            sum += i;  // sum에 i를 더한다. sum = sum + i
            i++;  // i를 1씩 증가시킨다. 즉, i는 1, 2, 3, ... 순으로 증가
        }

        // i가 101이 되었을 때 반복문을 종료하므로, i-1은 100이 된다.
        // 최종적으로 계산된 합 sum을 출력
        System.out.println("sum = " + sum);
//        System.out.println("1~" + (i - 1) + "합 : " + sum);
        // 출력 예시: 1~100합 : 5050
    }
}
