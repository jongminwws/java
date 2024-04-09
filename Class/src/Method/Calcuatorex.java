package Method;

public class Calcuatorex {
    public static void main(String[] args) {
        Calcuator myCalc = new Calcuator();
        //전원 on 기능을 담당하는 메서드 호출 (power on)
        myCalc.powerOn();
        // 두 수(5하고  6)을 사용자로 부터 입력받아서 더하기 기능을 담당하는 메서드 호출
        int result1 = myCalc.plus(5,6); // x값이 5, y값이 6 이 된다 매개 변수 지정
        System.out.println(result1);

        byte x =10;
        byte y = 4;
        // 두 수 를 사용자로 부터 입력 받아서 나누기 기능을 담당하는 메서드 호출
        double result2 = myCalc.divide(x,y);
        System.out.println(result2);
        // 전원 off 기능을 담당하는 메서드 호출
        myCalc.powerOff();
    }
}
