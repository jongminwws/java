package Istance;

public class Car1 {
    int speed;
    void  run() {
        System.out.println(speed+"달립니다");
    }

    public static void main(String[] args) {
        Car1 mycar = new Car1();
        mycar.speed = 60;
        mycar.run();
    }
}
