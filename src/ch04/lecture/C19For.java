package ch04.lecture;

public class C19For {
    public static void main(String[] args) {
//        2 x 1
//        2 x 2
//        2 x 3
//        ..
//        2 x 9

//        3 x 1
//        ..
//        3 x 9

//        ..

//        9 x 9

        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단###");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
