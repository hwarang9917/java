package ch06.exercise.p18;

public class ShopService {

    private static ShopService singleton = new ShopService();

    private ShopService() {
    }

    public static ShopService getInstance() {
        return singleton;
    }
}
