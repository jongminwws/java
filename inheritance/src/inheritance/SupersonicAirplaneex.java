package inheritance;

public class SupersonicAirplaneex {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flymode = SupersonicAirplane.SUPERSONIC; // 인스턴스 필드가 아니라 정적 필드라서 클래스 이름으로(SupersonicAirplane.SUPERSONIC) 호출
        sa.fly();
        sa.flymode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
