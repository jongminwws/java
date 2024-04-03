package Array;

public class MainArray {
    public static void main(String[] args) {
        if(args.length !=2){
            System.out.println("값 이상함");
            System.exit(0);        // 프로그램 강제 종료
        }
        String strNum1 = args[0]; //첫번째 데이터 
        String strNum2 = args[1]; // 두번째 데이터
        
        int num1 = Integer.parseInt(strNum1); // 문자열을 정수로 변환
        int num2 = Integer.parseInt(strNum2); // 문자열을 정수로 변환

        int result = num1 + num2;
        System.out.println(result);
        
    }
}
