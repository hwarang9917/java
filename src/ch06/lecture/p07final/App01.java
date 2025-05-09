package ch06.lecture.p07final;

public class App01 {
}

class MyClass01 {

    final int weight;
    final int height = 99;
    int age;

    MyClass01() {
        age = 3;
        age = 5;// ok

        weight = 9;
    }

    MyClass01(int a) {
        weight = 88;
    }

    void method1() {
        int a;
        a = 3;
        int b = 5;

        // 값을 바꿔 넣을 수 있음
        a = 7;
        b = 11;

//        final : 변수의 값을 한 번만 넣을 수 있음 (변경불가)
        final int c;
        c = 9;

//        두 번은 안 됨
//        c = 11;

    }

    void method2(int a) {
        System.out.println(a);
        a = 9; // ok
    }

    void method3(final int a) {
        System.out.println(a);
//        a = 9; // X
    }
}
