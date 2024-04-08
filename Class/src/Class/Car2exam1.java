package Class;

public class Car2exam1 {
    public static void main(String[] args) {

        //생성자 1 선택
        Car2 car1 = new Car2();
        System.out.println(car1.company);
        System.out.println();
        //생성자 2 선택
        Car2 car2 = new Car2("자가용");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println();
        //생성자 3 선택
        Car2 car3 = new Car2("자가용","빨강");
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println();
        //생성자 4 선택
        Car2 car4 = new Car2("자가용", "빨강", 200);
        System.out.println(car4.company);
        System.out.println(car4.color);
        System.out.println(car4.model);
        System.out.println(car4.maxSpeed);
    }
}
