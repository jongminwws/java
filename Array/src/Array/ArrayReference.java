package Array;

public class ArrayReference {
    public static void main(String[] args) {
        String[] srtArray = new String[3];
        srtArray[0] = "java";
        srtArray[1] = "java";
        srtArray[2] = new String("java");

        System.out.println(srtArray[0] == srtArray[1]);
        System.out.println(srtArray[0] == srtArray[2]);
        System.out.println(srtArray[0].equals(srtArray[2]));
    }
}
