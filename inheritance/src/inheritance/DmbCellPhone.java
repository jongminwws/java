package inheritance;

public class DmbCellPhone extends Cellphone{
    //핃드
    int channel;

    //생성자
    DmbCellPhone(String model, String color, int channel){
        this.model = model; // cellphone 클래스로부터 상속받은 필드
        this.color = color; // cellphone 클래스로부터 상속받은 필드
        this.channel = channel;
    }

    //메소드
    void turnOnDmb() {
        System.out.println("채널 :" + channel + "번 방송 수신 시작");
    }
    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("채널 : " + channel + "번으로 바꿈");
    }
    void turnOffDmb() {
        System.out.println("DMB 방송 수신을 멈춤");
    }
}
