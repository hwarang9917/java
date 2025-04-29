package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++; // 후위 증가 연산: x = 11 (사용 후 증가)
        ++x; // 전위 증가 연산: x = 12 (먼저 증가)
        System.out.println("x = " + x); // 출력: x = 12

        System.out.println("--------------------");
        y--; // 후위 감소 연산: y = 9
        --y; // 전위 감소 연산: y = 8
        System.out.println("y = " + y); // 출력: y = 8

        System.out.println("--------------------");
        z = x++; // z에 x(12)를 먼저 대입한 후 x는 13으로 증가
        System.out.println("z = " + z); // 출력: z= 12
        System.out.println("x = " + x); // 출력: x= 13

        System.out.println("--------------------");
        z = ++x; // x를 먼저 증가시켜 14, 그 후 z에 대입
        System.out.println("z = " + z); // 출력: z= 14
        System.out.println("x = " + x); // 출력: x= 14

        System.out.println("--------------------");
        z = ++x + y++; // ++x: x는 15로 증가, y++: y는 8이 사용되고 나서 9로 증가
        // z = 15 + 8 = 23
        System.out.println("z = " + z); // 출력: z=23
        System.out.println("x = " + x); // 출력: x=15
        System.out.println("y = " + y); // 출력: y=9
    }
}
