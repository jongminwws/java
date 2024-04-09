package Method;

public class sou1 {
    int solution(int a, int b) { // 솔루션 함수에는 리턴 값이 저장이 된다
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int sum = 0;
        for (int i = min ; i <= max; i++) { // a에 낮은숫자가 와야 함 그러면 최소값  최대값이 최소값 보다 크거나 같을 때 까지 i를 1씩 증가
            sum += i; // i값을 sum에 저장 
        }

        return sum; // sum값을 리턴해준다
    }
}
