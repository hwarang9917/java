package ch06.lecture.p06static;

public class App03 {
}

class MyClass03 {
    static String address;
    static int height;

    int age;
    String name;

    static void work() {
        System.out.println(address + ", " + height);
        greeting();
    }

    void action() {
        System.out.println(this.name + "은" + this.age + "세다");
        this.go();
    }

    static void greeting() {

    }

    static void staticMethod() {
//        클래스메소드(멤버)에서 인스턴스멤버 접근 불가능
//        go(); // X
//        System.out.println(name); // X
    }

    void instanceMethod() {
//        인스턴스메소드(멤버)에서 클래스멤버 접근 가능
        greeting(); // ok
        System.out.println(address); // ok
    }

    void go() {

    }
}
