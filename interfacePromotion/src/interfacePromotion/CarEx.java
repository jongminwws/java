package interfacePromotion;

public class CarEx {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        myCar.frontLeft=new KumhoTire();
        myCar.frontRight= new KumhoTire();

        myCar.run();
    }
}
