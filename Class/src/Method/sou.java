package Method;

import java.util.Scanner;

public class sou {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            sou1 s1 = new sou1();
            System.out.println("첫번 째 숫자 :");
            int a = scanner.nextInt();
            System.out.println("두번 째 숫자 :");
            int b = scanner.nextInt();
            int result = s1.solution(a, b); // 솔류션 함수 를 불러와서 그 값을 result에 저장을 한다
            System.out.println("결과: " + result); //
        }
    }

