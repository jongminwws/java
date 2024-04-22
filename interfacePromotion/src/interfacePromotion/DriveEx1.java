package interfacePromotion;

public class DriveEx1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus1 bus1 = new Bus1();
        Taxi taxi = new Taxi();

//        driver.drive(bus1);
        driver.drive(taxi);
    }
}
