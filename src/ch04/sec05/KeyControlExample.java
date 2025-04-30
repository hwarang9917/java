package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받기 위한 준비
        Scanner scanner = new Scanner(System.in);

        // 프로그램이 실행 중인지 여부를 나타내는 변수
        boolean run = true;

        // 현재 속도를 나타내는 변수 (초기값 0)
        int speed = 0;

        // 프로그램이 실행되는 동안 반복적으로 사용자에게 메뉴를 보여주고 선택을 받음
        while (run) {
            // 메뉴 출력: 사용자가 선택할 수 있는 옵션을 표시
            System.out.println("----------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("----------------");
            System.out.println("선택:");

            // 사용자로부터 입력을 받기 위해 nextLine()을 호출하여 선택을 받음
            String strNum = scanner.nextLine();

//            // 사용자가 선택한 번호에 따라 동작을 수행
//            if (strNum.equals("1")) {
//                // 1을 선택하면 속도를 증가시킴
//                speed++;  // speed 값을 1 증가
//                System.out.println("현재 속도 = " + speed);
//            } else if (strNum.equals("2")) {
//                // 2를 선택하면 속도를 감소시킴
//                // 속도가 음수로 떨어지지 않도록 조건을 추가하여 최소 0으로 유지
//                speed--;  // speed 값을 1 감소
//                System.out.println("현재 속도 = " + speed);
//            } else if (strNum.equals("3")) {
//                // 3을 선택하면 프로그램을 종료하도록 설정
//                run = false;  // run을 false로 설정하여 while 루프를 종료
//            }

            do {
                System.out.println("1: 증속, 2: 감속, 3: 중지");
                strNum = scanner.nextLine();  // 사용자 입력 받기

                switch (strNum) {
                    case "1": // 증속
                        speed++;  // speed 값을 1 증가
                        System.out.println("현재 속도 = " + speed);
                        break;

                    case "2": // 감속
                        // 속도가 음수로 떨어지지 않도록 조건을 추가하여 최소 0으로 유지
                        if (speed > 0) {
                            speed--;  // speed 값을 1 감소
                        }
                        System.out.println("현재 속도 = " + speed);
                        break;

                    case "3": // 중지
                        run = false;  // run을 false로 설정하여 do-while 루프 종료
                        break;

                    default: // 잘못된 입력 처리
                        System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                        break;
                }
            } while (run);

        }

        // while 루프 종료 후, 프로그램 종료 메시지 출력
        System.out.println("프로그램 종료");
    }
}
