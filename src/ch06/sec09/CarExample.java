package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("포르쉐");
        Car yourCar = new Car("페라리");

        myCar.run();
        yourCar.run();
    }
}