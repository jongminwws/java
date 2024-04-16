package promotion;

public class HanKookTire extends Tire {
    //필드
    //생성자
    public HanKookTire(String location,int maxRotation) {
        super(location,maxRotation);
    }
    
    @Override
    public boolean roll() { // 다른 내용을 출력하기 위해 재정의한 roll 메소드
        ++accumulatedRotation;
        if (accumulatedRotation<maxRotation) {
            System.out.println(location + "HankookTire 수명 : " + (maxRotation-accumulatedRotation) + "회");
            return true;
        }else {
            System.out.println("***" + location + "펑크");
            return false;
        }
    }
}
