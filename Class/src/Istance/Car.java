package Istance;

public class Car {
    //필드
    String model; //인스턴스 필드
    int speed; // 인스턴스 필드
    
    //생성자
    Car(String model){
        this.model = model;
    }
    
    //메소드
    void setSpeed(int speed){
        this.speed = speed;
    } // setSpeed 메서드 선언 (인스턴스 메서드)
    
    void  run() { // run 메서드 선언 (인스턴스 메서드)
        for (int i = 0; i<=50; i+=10) {
            this.setSpeed(i); // setSpeed 메서드 호출
            System.out.println(this.model+ "이 달립니다(시속 :" + this.speed + "입니다");
        }
    }
}
