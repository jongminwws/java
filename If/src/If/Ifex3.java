package If;

import java.util.Scanner;

public class Ifex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String a = "참 잘했습니다";
        String b = "좀더 노력하세여";
        String c = "다음학기에 다시 수강";
        if(score >=90){
            System.out.println("A");
            System.out.println("메세지 : "+ a);
        }else if(score >=80){
            System.out.println("B");
            System.out.println("메세지 : "+ a);
        }else if (score >=70){
            System.out.println("C");
            System.out.println("메세지 : "+ b);
        }else if(score>=60){
            System.out.println("D");
            System.out.println("메세지 : "+ b);
        }else{
            System.out.println("F");
            System.out.println("메세지 : "+ c);
        }

    }
}
