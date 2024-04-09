package Method;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex2 myex = new Ex2();

        System.out.println("첫번 째 정수 입력");
        int num1 = scanner.nextInt();

        System.out.println("연산자 입력");
        char op = scanner.next().charAt(0);

        System.out.println("두번 째 정수 입력 :");
        int num2 = scanner.nextInt();

        switch (op){
            case '+' :
                System.out.println(num1 + num2);
                break;
            case '-' :
                System.out.println(num1 - num2);
                break;
            case '*' :
                System.out.println(num1 * num2);
                break;
            case '/' :
                System.out.println((double) num1 / num2);
                break;
        }


    }
}
