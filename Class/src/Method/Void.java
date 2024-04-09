package Method;

public class Void {
    int gas = 0;
    void run() {
        while (true){
            if(gas >0) {
                System.out.println("gas잔량 :" + gas);
                gas -= 1;
            }else {
                System.out.println("gas 잔량 :" + gas);
                return; // void 메소드 실행 종료
            }
        }
    }
}
