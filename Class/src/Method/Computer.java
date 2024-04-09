package Method;

public class Computer {
    // 매개 변슈 개수를 모를 때
    // 1. 배열 이용
    int sum1(int [] values) { // 처음에 빨간줄이 뜨는 이유는 int는 리턴 타입이 필요해서 리턴 타입을 넣거나 int를 void로 변경을 해줘야 한다.
        int sum =0;
        for(int i=0; i<values.length;i++) {
            sum += values[i];
        }
        return sum;
    }

    // 2 ... 이용
    int sum2 (int ... values) {
        int sum = 0;
        for(int i=0; i<values.length;i++) {
            sum += values[i];
        }
        return sum;
    }
}
