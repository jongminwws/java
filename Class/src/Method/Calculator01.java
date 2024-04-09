package Method;

public class Calculator01 {
    int plus(int x, int y) { // plus 메서드 선언
        int result = x + y;
        return result;
    }
    double avg(int x, int y){ // avg 메서드 선언
        double sum = plus(x, y); // plus 메서드 호출 
        double result = sum /2;
        return result;
    }
    void execute() {
        double result = avg(7,10); // avg 메서드 호출
        println("실행결과 :" + result); // println 메서드 호출
    }
    void println (String message) { // println 메서드 선언
        System.out.println(message);
    }
}
