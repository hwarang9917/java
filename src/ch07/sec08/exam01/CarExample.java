package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        //Car객체 생성
        Car myCar = new Car();

        //Tire 장착
        myCar.tire = new Tire();
        myCar.run();

        //HankookTire 장착
        myCar.tire = new HankookTire();
        myCar.run();

        //KumhoTire 장착
        myCar.tire = new KumhoTire();
        myCar.run();
    }
}