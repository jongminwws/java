package interface1;

public class Soundex {
    private static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new dog());
    }
}
