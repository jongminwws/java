package interface1;

public class Audio implements RemoteControl{
    private int volume;

    public void turnOn(){
        System.out.println("Audio를 켭니다");
    }
    public void turnOff() {
        System.out.println("오디오를 끕니다");
    }
    public  void setVolume(int volume){ // 인터페이스 상수를 이용해서 volume 필드의 값을 제한
        if (volume>RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume<RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 오디오 볼륨 :" + this.volume);
    }
}
