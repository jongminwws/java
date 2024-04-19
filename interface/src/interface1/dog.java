package interface1;

public class dog implements Soundable {
    public String sound() {
        return "멍멍"; // void가 아니니깐 리턴 값을 줘야 한다.
    }
}
