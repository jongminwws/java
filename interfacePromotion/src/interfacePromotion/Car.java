package interfacePromotion;

public class Car {
    Tire frontLeft = new Hankook(); // 인터페이스 타입 필드 선언과 초기 구현 객체 대입
    Tire frontRight = new Hankook();
    Tire backLeft = new Hankook();
    Tire backRight = new Hankook();

    void run() {
        frontLeft.roll(); // 인터페이스에서 설명된 roll 메소드 호출
        frontRight.roll();
        backLeft.roll();
        backRight.roll();
    }
}
