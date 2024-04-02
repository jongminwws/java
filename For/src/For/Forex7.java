package For;

import java.util.Scanner;

public class Forex7 {
    public static void main(String[] args) {
        boolean run =true;
        int x = 0; // 잔금
        int z = 0; // 출금액
        int y = 0; // 예금액
        Scanner scanner = new Scanner(System.in); // 스캐너 : 사용자가 입력한 값 받기
        while (run){
            System.out.println("---------------");
            System.out.println("1.예금 || 2.출금 || 3.잔고 ||4.종료");
            System.out.println("---------------");
            System.out.println("선택>");
            int choice = scanner.nextInt(); // choice 스캐너를 통해서 입력한 값이 스위치를 통해서 나온다 1번을 입력하면 case 1이 출력됨
            switch (choice){
                case 1 :
                    System.out.println("예금액>");
                    y = scanner.nextInt(); //예금액을 스캐너를 통해서 입력
                    x += y; // 잔고에 예금액 값을 저장해준다
                    break; // 그리고 종료
                case 2:
                    System.out.println("출금액>");
                    z = scanner.nextInt();// 출금액을 스캐너를 통해 입력
                    if (x <z) { // 만약 가진 돈 보다 출금할 돈이 크면
                        int is = x - z; // 잔고금액 - 출금액 을 is 변수에 저장 즉 얼마가 모자란지
                        System.out.println("잔고부족" + is); // 모자란 금액을 출력
                    }else { // 아닐경우
                        x -= z; //출금액 값을 -해서 잔고액에 저장을 한다
                    }
                    break; // 그리고 종료
                case 3:
                    System.out.println("잔고>" +x); // 현재 잔고 를 나타낸다
                    break; // 종료
                default:
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
            }
        }
        scanner.close();
    }

}
