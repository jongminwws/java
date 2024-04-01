package operator;

public class increasedecreaseoperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        System.out.println("-------------------");
        ++x;
        ++x;
        System.out.println(x);
        System.out.println("---------------------");
        --y;
        --y;
        System.out.println(y);
        System.out.println("----------------------");
        int z = x++;
        System.out.println(z);
        System.out.println(x);
        System.out.println("------------------------");
        ++x;
        System.out.println(x);
        System.out.println(x);
        ++x;
        z = x + y++;
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);
    }
}
