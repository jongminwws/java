package Javaexam1;

import java.util.Scanner;

public class JavaExam1 {
    public static void main(String[] args) {

        int a = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력");
        a = scanner.nextInt();
        System.out.println("출력");
        System.out.print("{");
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                if (count > 0) {
                    System.out.print(", ");
                }
                System.out.print(i);
                count++;
            }
        }
        System.out.println("}");
        System.out.println("약수의 개수는 " + count + "개 입니다.");
    }
}
