package abstract1;

public class Phoneex {
    public static void main(String[] args) {
        //Phone phone = new Phone();

        SmartPhone smartPhone = new SmartPhone("홍길동");

        //phone의 메소드
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
