package ch06.sec07.exam05;

public class Car {
    //필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car(String model){  //생성자1
        //20라인 생성자 호출
        this(model, "은색", 250);
    }

    Car(String model,String color){  //생성자2
        //20라인 생성자 호출
        this(model, color, 250);
    }

    Car(String model, String color,int maxSpeed){ //생성자3
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}