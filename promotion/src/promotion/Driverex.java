package promotion;

public class Driverex {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Texi texi = new Texi();

        driver.drive(bus); // 자동 타입 변환 : vehicle vehicle = bus;
        driver.drive(texi); // 자동 타입 변환 : vehicle vehicle = texi;
    }
}
