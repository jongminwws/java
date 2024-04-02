package For;

import java.util.Scanner;

public class Forex6 {
    public static void main(String[] args) {
        
    
    boolean run = true;
    int balance = 0; // 잔고
    int withrow = 0; // 출금
    int despoit = 0; // 예금
    Scanner scanner  = new Scanner(System.in);
    
    while (run) {
        System.out.println("-----------------");
        System.out.println("1.예금 || 2.출금 || 3.잔고 || 4.종료");
        System.out.println("------------------");
        System.out.print("선택>");
        int choice = scanner.nextInt();
        if(choice == 1) {
            System.out.println("예금액>");
            despoit = scanner.nextInt();
            balance += despoit; // 입력된 예금액을 잔고에 더해줌

        } else if(choice ==2){
            System.out.println("출금액>");
            withrow = scanner.nextInt();
            if(balance - withrow < 0){
                int isf = balance - withrow;
                System.out.println("잔고부족"+ isf );
            }else {
                balance -= withrow;
            }
        }else if (choice == 3) {
            System.out.println("잔고>" + balance);
        }else if(choice ==4){
            System.out.println("프로그램 종료");
            break;
        }
    }
    scanner.close();
    }
}
