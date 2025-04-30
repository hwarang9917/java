package ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        // 8시부터 11시까지의 시간대 중 하나를 랜덤하게 선택합니다.
        // Math.random() * 4는 0.0 이상 4.0 미만의 랜덤 값을 생성하고,
        // 그 값에 8을 더하여 8, 9, 10, 11 중 하나의 값이 나옵니다.
        int time = (int) (Math.random() * 4) + 8;

        // 랜덤으로 결정된 현재 시간을 출력합니다.
        System.out.println("[현재 시간 : " + time + "시]");

        // switch 문: time 값에 따라서 실행할 코드가 다릅니다.
        switch (time) {
            case 8:
                // 8시일 경우 "출근합니다." 출력
                System.out.println("출근합니다.");
                // 'break'가 없어서 아래 case 9와 10도 실행됩니다.
            case 9:
                // 9시일 경우 "회의를 합니다." 출력
                System.out.println("회의를 합니다.");
                // 'break'가 없어서 아래 case 10도 실행됩니다.
            case 10:
                // 10시일 경우 "업무를 봅니다." 출력
                System.out.println("업무를 봅니다.");
                // 'break'가 없어서 default도 실행됩니다.
            default:
                // 위의 case가 실행된 후, 마지막으로 "외근을 나갑니다." 출력
                System.out.println("외근을 나갑니다.");
        }
    }
}
