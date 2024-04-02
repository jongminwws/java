package If;

import java.util.Scanner;

public class Ifex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        if((c%3)==0 && !((c%4) ==0)){

            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
