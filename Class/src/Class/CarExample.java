package Class;

public class CarExample {
    public static void main(String[] args) {
        //객체 생성
        Car myCar = new Car(); // myCar 변수에는 Car 클래스에 있는 필드 car 만 사용가능

        //필드 값 읽기
        System.out.println("제작회사 : " + myCar.company);
        System.out.println("모델명 : " + myCar.model);
        System.out.println("최고속도 : " + myCar.maxSpeed);
        System.out.println("현재속도 : " + myCar.speed);

        //필드 값 변경
        myCar.speed=60;
        System.out.println("수정된 속도 : "+ myCar.speed);


        Car uCar = new Car();

        uCar.company="기아";
        uCar.model = "k3";
        uCar.color = "흰색";
        uCar.maxSpeed = 330;
        uCar.speed = 0;

        System.out.println(uCar.company);
        System.out.println(uCar.model);
        System.out.println(uCar.color);
        System.out.println(uCar.speed);
        System.out.println(uCar.maxSpeed);
    }
}
