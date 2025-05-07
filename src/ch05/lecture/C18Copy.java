package ch05.lecture;

import java.util.Arrays;

public class C18Copy {
    public static void main(String[] args) {
        int[][] a = {{9, 3}, {5, 7}};
        int[][] b = a; // 참조값 복사
        int[][] c = {a[0], a[1]}; // 원소(item)의 참조값 복사
        int[][] d = {{a[0][0], a[0][1]}, {a[1][0], a[1][1]}};

        a[0][0] = 99;
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(b[0]));
        System.out.println(Arrays.toString(c[0]));
        System.out.println(Arrays.toString(d[0]));
    }
}
