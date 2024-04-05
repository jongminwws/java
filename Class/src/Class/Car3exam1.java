package Class;

public class Car3exam1 {
    public static void main(String[] args) {
        Car3 car1 = new Car3();
        System.out.println(car1.company);
        System.out.println();

        Car3 car2 = new Car3("자가용");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println();

        Car3 car3 = new Car3("자가용","빨강");
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println();

        Car3 car4 = new Car3("자가용","검정",200);
        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);
        System.out.println();

    }
}
