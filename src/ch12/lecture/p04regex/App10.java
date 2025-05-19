package ch12.lecture.p04regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "010(-| )?\\d{4}(-| )?\\d{4}";

        while (true) {
            System.out.print("전화번호>");
            String input = scanner.nextLine();

            boolean result = Pattern.matches(regex, input);

            if (result) {
                System.out.println("🙆 유효한 전화번호");
            } else {
                System.out.println("🙅‍♂️ 유효하지 않은 전화번호");
            }
            System.out.println();
        }
    }
}