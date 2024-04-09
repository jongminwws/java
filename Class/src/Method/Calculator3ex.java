package Method;

import java.util.Scanner;

public class Calculator3ex {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Calculator3 calculator = new Calculator3();

        System.out.println("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt(); // 첫번째 정수 입력
        calculator.setNum1(num1); // 입력한 값을 객체 num1에 넣음


        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        char operator = scanner.next().charAt(0); //// 사용자로부터 연산자 입력 받음

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt(); // 드번째 정수 입력
        calculator.setNum2(num2); // 입력한 값을 객체 num2에 넣음



        switch (operator) {
            case '+' :
                System.out.println("덧셈결과 :" + calculator.getadd());
                break;
            case '-':
                System.out.println("뺄셈 결과: " + calculator.getSub());
                break;
            case '*':
                System.out.println("곱셈 결과: " + calculator.getMul());
                break;
            case '/':
                System.out.println("나눗셈 결과: " + calculator.getDiv());
                break;
        }
    }
}
