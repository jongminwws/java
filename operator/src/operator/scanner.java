package operator;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번 째 수 :");
        String num1 = scan.next();
        System.out.print("두번 째 수 :");
        String num2 = scan.next();
        double parseNum1 = Double.parseDouble(num1);
        double parseNum2 = Double.parseDouble(num2);
        if (parseNum2 != 0 && parseNum2 != 0.0) {
            System.out.println("결과 : " + parseNum1 / parseNum2);
        } else {
            System.out.println(" 결과 무한대");
        }

    }
}
