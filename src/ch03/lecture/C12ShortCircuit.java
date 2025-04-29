package ch03.lecture;  // 패키지 선언

public class C12ShortCircuit {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // short circuit 사용: &&
        // &&는 왼쪽 조건이 false면 오른쪽 조건을 **평가하지 않음**
        boolean r1 = ((a++) < 0) && ((b++) > 0);
        // (a++) < 0 : a는 5이고, 후위 증가이므로 비교 후에 a가 6이 됨 -> false
        // 앞 조건이 false이므로 && 연산 특성상 뒤 조건은 **실행되지 않음**
        // 따라서 b는 증가하지 않음

        System.out.println("r1 = " + r1); // false
        System.out.println("a = " + a);   // 6 (a는 위에서 한 번 증가)
        System.out.println("b = " + b);   // 3 (b는 평가되지 않아서 그대로)

        // a와 b를 다시 초기화
        a = 5;
        b = 3;

        // 단일 & 사용: 논리 AND 연산이지만 short circuit을 하지 않음
        // 왼쪽 조건이 false여도 **오른쪽 조건을 반드시 평가함**
        boolean r2 = ((a++) < 0) & ((b++) > 0);
        // (a++) < 0 : false, 하지만 &이므로 뒤 조건도 확인함
        // (b++) > 0 : true, b는 후위 증가되므로 4가 됨
        // 최종 결과는 false & true → false

        System.out.println("r2 = " + r2); // false
        System.out.println("a = " + a);   // 6 (a는 증가됨)
        System.out.println("b = " + b);   // 4 (b도 증가됨)
    }
}
