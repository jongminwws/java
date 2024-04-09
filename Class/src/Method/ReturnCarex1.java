package Method;

public class ReturnCarex1 {
    public static void main(String[] args) {
        ReturnCar myCar = new ReturnCar();
        myCar.setGas(5); // ReturnCar 의 setGas 메소드 호출

        boolean gasState = myCar.isLeftGas(); // Car의 isLeftGas 메소드 호출
        if(gasState) {
            System.out.println("출발");
            myCar.run(); // Car의  run 메소드 호출
        }
        if (myCar.isLeftGas()) { // car의 isLeftGas 메소드 호출
            System.out.println("gas를 주입할 필요없음");
        }else {
            System.out.println("gas 를 주입하세여");
        }
    }
}
