package interfacePromotion;

public class Vehicle1Ex {
    public static void main(String[] args) {
        Vehicle1 vehicle1 = new Bus1();

        vehicle1.run();
//        vehicle1.checkFare(); x vehicle 인터페이스에는 checkFare가 없음

        Bus1 bus1 = (Bus1) vehicle1; //강제 타입 변환

        bus1.run();
        bus1.checkFare(); // bus클래에스는 checkFare가 있음
    }
}
