package ch12.lecture.p01object;

public class App09 {
    public static void main(String[] args) {
        Car09 c1 = new Car09("tesla", 7000);
        Car09 c2 = new Car09("genesis", 6000);
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println(c1);
        System.out.println(c2);
    }
}

class Car09 {
    private String model;
    private int price;

    public Car09(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car09{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}