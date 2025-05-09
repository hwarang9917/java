package ch06.lecture.p06static;

public class App02 {
    public static void main(String[] args) {
        System.out.println(MyClass02.number);
        MyClass02 a = new MyClass02();
        System.out.println("a.age = " + a.age);
    }
}

class MyClass02 {
    // static field
    static int number;

    // static block
    static {
        // static filed 초기화 코드 작성 가능
        int a = 3;
        if (true) {
            a *= 10;
        }
        number = a;
    }

    // instance field
    int age;

    MyClass02() {
        int a = 3;
        if (true) {
            a = a * 10;
        }
        this.age = a;
    }
}