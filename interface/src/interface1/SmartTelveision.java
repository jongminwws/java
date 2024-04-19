package interface1;

public class SmartTelveision  implements RemoteControl,Searchable {
    private int volume;

    public void turnOn() {
        System.out.println("티비를 켭니다");
    }

    public void turnOff() {
        System.out.println("티비를 끕니다");
    }

    public void setVolume(int volume) { // 인터페이스 상수를 이용해서 volume 필드의 값을 제한
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 티비 볼륨 :" + this.volume);
    }

    public void search(String url) {
        System.out.println(url+"을 검색");
    }
}

