package inheritance;

public class SupersonicAirplane extends Airplane {
    public static final int NORMAL = 1; // static 이 붙어서 정적 필드임 그리고 final 이 있으니깐 상수로 지정된다.
    public static final int SUPERSONIC = 2;
    
    public int flymode = NORMAL;
    
    @Override
    public void fly() {
        if (flymode == SUPERSONIC){
            System.out.println("초음속비행");
        }else{
            super.fly(); // airplane 부모 클래스 객체의 fly() 메소드 호출
        }
    }
}
