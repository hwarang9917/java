package ch04.exercise;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        while문, Scanner nextLine() 메소드
//        키보드 입력된 데이터로
//        예금, 출금, 조회, 종료 기능 제공하는 코드 작성

        int a = 0; // 잔액

//        메뉴를 선택하는 반복문 (do-while)
        int option;
        do {
            // 메뉴 출력
            System.out.println("1. 예금");
            System.out.println("2. 출금");
            System.out.println("3. 잔고");
            System.out.println("4. 종료");
            System.out.println("선택: ");
            option = Integer.parseInt(scanner.nextLine());  // 사용자의 선택을 받음

            switch (option) {
                case 1: // 예금
                    System.out.print("예금할 금액을 입력하세요: ");
                    int b = Integer.parseInt(scanner.nextLine());
                    if (b > 0) {
                        a += b;  // 예금액을 잔액에 더함
                        System.out.println("예금 완료. 잔고: " + a + "원");
                    }
                    break;

                case 2: // 출금
                    System.out.print("출금할 금액을 입력하세요: ");
                    int c = Integer.parseInt(scanner.nextLine());
                    if (c > 0 && c <= a) {
                        a -= c;  // 출금액을 잔액에서 뺌
                        System.out.println("잔고: " + a + "원");
                    }
                    break;

                case 3: // 잔고
                    System.out.println("잔고: " + a + "원");
                    break;

                default: // 종료
                    System.out.println("프로그램을 종료합니다.");
            }
        } while (option != 4);  // 종료 메뉴가 선택될 때까지 반복

        scanner.close();  // Scanner 객체 닫기
    }
}
