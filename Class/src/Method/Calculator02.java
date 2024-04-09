package Method;

public class Calculator02 {
    // 매개변수 개수가 다를 경우
    //정사각형의 넓이(한개의 값) 매개변수 width가 한개
    double areaRectangle(double width) { // 오버로딩 조건 메소드 이름이 같아야 한다, 매개 변수 개수가 다르던지, 타입이 다르던지 둘중 하나라도 만족시키면 오버로딩이 가능
        return width * width; // 리턴 타입은 상관없음
    }
    //직사각형의 넓이 (두개의 값) width,height 매개 변수가 2개

    double areaRectangle(double width, double height) {
        return width * height;
    }

    // 타입이 다를경우
    // 더하기 (정수 + 정수)
    int plus (int x, int y){
        return x+y;
    }
    // 더하기 (실수 + 정수)
    double plus (double x, int y){
        return x+y;
    }

    // 더하기 (정수 + 실수)
    double plus (int x, double y) {
        return x + y;
    }
    // 더하기 (실수 + 실수)
    double plus (double x, double y){
        return x+y;
    }
}
