package Method;

public class ReturnCar {
    //필드
    int gas;

    //생성자
    // ReturnCar(){}기본 생성자 추가


    //메소드
    void setGas(int gas){
        this.gas=gas; // 리턴값이 없는 메소드로 매개값을 받아서 gas 필드 값을 변경
    }
    boolean isLeftGas () {
        if(gas == 0) {
            System.out.println("gas가 없음"); // 리턴값이 boolean인 메소드로 gas 필드값이 0이면 false, 0이 아나면 true를 리턴
            return false; // false 를 리턴
        }
        System.out.println("gas가 있음");
        return true; // true 를 리턴
    }

    void run() {
        while (true){ // 리턴값이 없는 메소드로 gas필드값이 0이면 return문으로 강제 종료
            if (gas >0) {
                System.out.println("현재 가스 :" + gas);
                gas -=1;
            }else {
                System.out.println("현재 가스 :" + gas);
                return; // 메소드 실행 종료
            }
        }
    }

}
