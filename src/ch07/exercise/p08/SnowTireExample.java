package ch07.exercise.p08;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        tire.run();
        SnowTire.run();
    }
}
