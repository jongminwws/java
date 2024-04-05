package Class;

public class Car3 {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car3 () {

    }

    Car3(String model){
        this(model, "은색",250); // 호출
    }

    Car3 (String model, String color){
        this(model, color, 250); // 호출
    }

    Car3(String model, String color, int maxSpeed){
        this.model = model; // 공통 실행 코드
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
