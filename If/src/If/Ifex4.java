package If;

import java.util.Scanner;

public class Ifex4 {
    public static void main(String[] args) {
        //정수 2개와 사칙연산(+,-,*,/)가 각각 공백을 사이에 두고 주어지는 경우, 해당 연산의 결과를 출력하는 프로그램을 작상해보자
        //   결과
        //   계산식을 입력하세요(ex : 3 * 7).>3 * 7
        //   계산 결과는 21.0입니다.
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 연산자 입력 :");
        int a = scanner.nextInt();
        System.out.println("기호 입력 :" );
        String t = scanner.next();
        System.out.println("두번 째 연산자 입력 : ");
        int b = scanner.nextInt();
        double x =0;
        switch (t){
            case "*":
                x = a * b;
                break;
            case "+":
                x = a+b;
                break;
            case "-":
                x = a-b;
            case "/":
                x = a/b;
        }
        System.out.println(x);

        }
    }

