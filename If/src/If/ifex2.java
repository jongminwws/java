package If;

import java.util.Scanner;

public class ifex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세여");
        int c = scanner.nextInt();

        if (c==0){    //(c%3)==0)
            System.out.println("0");
        }else if(c%3 !=0){
            System.out.println("홀수입니다");
        }else {
            System.out.println(c);
        }
    }
}
