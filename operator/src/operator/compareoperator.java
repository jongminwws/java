package operator;

public class compareoperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        boolean result1 = x == y;
        boolean result2 = x != y;
        boolean result3 = x <= y;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        char char1 = 65;
        char char2 = 66;
        boolean result4 = char1 < char2;
        System.out.println(result4);
        int v2 = 1;
        double v3 = 1.0;
        System.out.println((double)v2 == v3);
        double v4 = 0.1;
        float v5 = 0.1F;
        System.out.println(v4 == (double)v5);
        System.out.println((float)v4 == v5);
    }
}
