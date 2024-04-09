package Method;

import java.util.Scanner;

public class Calculator3 {

    int num1 = 0; //임의의 값으로 초기화
    int num2 = 0; //임의의 값으로 초기화

    // num1의 get 메서드
    int getNum1() {

        return num1;
    }

    // num1의 set 메서드
   void setNum1(int num1){
        this.num1 = num1;
    }
    // num2의 get 메서드
    int getNum2() {

        return num2;
    }

    // num2 의 set 메서드
    void setNum2(int num2) {
        this.num2 = num2;
    }

    int getadd(){

        return num1 + num2;
    }

    int getSub(){
        return num1 - num2;
    }

    int getMul(){
        return num1 * num2;
    }

    double getDiv() {
        return (double) num1 / num2;
    }

}
