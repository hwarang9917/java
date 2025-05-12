package ch07.lecture.p03polymorphism;

public class App03 {
    public static void main(String[] args) {
        Dog1 a = new Dog1();
        BullDog01 b = new BullDog01();
        Chihuahua01 c = new Chihuahua01();

        a.bark(); // 멍멍
        b.bark(); // 멍멍
        c.bark(); // 멍멍

        Dog1 d = b; // ok
        d.bark(); // 멍멍? 으르렁? 으르렁 (실제 인스턴스의 메소드 실행) *중요!*
        Dog1 e = c;
        e.bark(); // 깨갱
    }
}

class Dog1 {
    public void bark() {
        System.out.println("멍멍");
    }
}

class BullDog01 extends Dog1 {
    public void bark() {
        System.out.println("으르렁");
    }
}

class Chihuahua01 extends Dog1 {
    public void bark() {
        System.out.println("깨갱");
    }
}

