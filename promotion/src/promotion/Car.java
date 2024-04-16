package promotion;

public class Car {
    //필드
    Tire frontLeftTire = new Tire("앞왼쪽",6);
    Tire frontRightTire = new Tire("앞오른쪽",2);
    Tire backLeftTire = new Tire("뒤왼쪽",3);
    Tire backRightTire = new Tire("뒤오른쪽",4);

    //생성자

    //메소드
    int run() {
        System.out.println("자동차 달림");
        if (frontLeftTire.roll()==false){stop();return 1;} //모든 타이어를 1회 회전시키기 위해 각 tire객체의 roll 메소드를 호출. false를 리턴하는 roll이 있을경우 stop메소드를 호출하고 해당 타이어를 리턴
        if (frontRightTire.roll()==false){stop();return 2;}
        if (backLeftTire.roll()==false){stop();return 3;}
        if (backRightTire.roll()==false){stop();return 4;}
        return 0;
    }
    
    void stop(){
        System.out.println("자동차가 멈춤"); // 펑크 났을 때 실행
    }
}
