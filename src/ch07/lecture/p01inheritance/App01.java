package ch07.lecture.p01inheritance;

public class App01 {
    public static void main(String[] args) {
        SubClass011 a = new SubClass011();
        a.age = 33;
        System.out.println("a.age = " + a.age);
        System.out.println("a.name = " + a.name);
        a.action();

        SubClass012 b = new SubClass012();
        b.age = 44;
//        b.name = "abc";
        b.address = "ny";
        System.out.println("b.age = " + b.age);
        System.out.println("b.address = " + b.address);
        b.action();
//        b.greeting();
        b.go();

        MyClass01 c = new MyClass01();
        c.age = 77;
//        c.name = "q";
//        c.address = "n";
        System.out.println("a.age = " + a.age);
    }

}

class MyClass01 {
    //    부모클래스(parent class)
//    상위클래스(upper class)
    public int age;

    public void action() {

    }
}

class SubClass011 extends MyClass01 {
//    자식클래스(child class)
//    하위클래스(sub class)
//    하나의 자식 클래스가 여러 부모 클래스를 둘 수 없음
//    하나의 부모 클래스가 여러 자식 클래스를 둘 수 있음

    public String name;

    public void greeting() {

    }



}

class SubClass012 extends MyClass01 {
    public void go() {

    }

    public String address;

}
