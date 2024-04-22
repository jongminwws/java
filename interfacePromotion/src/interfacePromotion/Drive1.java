package interfacePromotion;

public class Drive1 {
    public void drive1(Vehicle1 vehicle1) { // vehicle2 는 bus객체 taxi 객체
        if (vehicle1 instanceof Bus1) { // vehicle 매개 변수가 참조하는 객체가 Bus인지 조사
            Bus1 bus1 = (Bus1) vehicle1; // bus 객체일 경우 안전하게 강제 타입 변환
            bus1.checkFare();
        }
        vehicle1.run();
    }
}
