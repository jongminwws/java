package Method;

public class Calcuator {
    //메소드
    void powerOn(){
        System.out.println("전원을 켭니다");
    }
    // 더하기 기능을 담당하는 메서드
    int plus(int x,int y) {
        int result = x+y;
        return result;
    }

    // 나누기 기능을 담당하는 메서드
    double divide(int x, int y){
        double result = (double) x / (double) y;
        return  result;
    }

    //전원 off 기능을 담당하는 메서드
    void powerOff() {
        System.out.println("전원을 끕니다");
    }
}
