package interface1;

public class Television implements RemoteControl{
    //핅드
    private int volume;
    
    //trunon추상 메소드의 실체 메소드
    public void turnOn(){
        System.out.println("tv를 킵니다");
    }
    //trunoff 추상 메소드의 실체 메소드
    public void turnOff() {
        System.out.println("tv를 끕니다");
    }
    //setvolume 추상 메소드의 실체 메소드
    public  void setVolume(int volume){ // 인터페이스 상수를 이용해서 volume 필드의 값을 제한
        if (volume>RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 tv 볼륨 :" + this.volume);
    }
}
