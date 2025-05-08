package ch06.lecture.p03method;

public class App05 {
    public static void main(String[] args) {
        MyClass05 a = new MyClass05();
        a.method();
        a.method(1);
        a.method(10, 20);
        a.method(11, 22, 33);

        a.greetings("hello");
        a.greetings("hello", 99);
        a.greetings("hello", 88, 77);
    }
}

class MyClass05 {
    void action(int a) {

    }

    void action(int a, int b) {

    }

    void action(int a, int b, int c) {

    }

//    varargs
    void method(int... a) {
//        varargs는 메소드 내에서 배열로 사용
        System.out.println(a.length + "개의 파라미터 넘어옴");
        for (int i =0; i < a.length; i++) {
            System.out.println("a[i] = " + a[i]);
        }
    }
    void greetings(String a, int... b) {

    }
}
