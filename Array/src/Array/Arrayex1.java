package Array;

public class Arrayex1 {
    public static void main(String[] args) {
        int max =0;

        int [] array = {1,5,3,8,2};
        int min= array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){ // 현재 인덱스 i에 해당하는 배열 요소가 max보다 큰지를 확인
                max = array[i]; // 만약 array[i]가 max보다 크다면, max 변수에 해당 값을 할당 즉 제일 높은 값이 나옴.
            }

        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){ // 현재 인덱스 i에 해당하는 배열 요소가 max보다 큰지를 확인
                min = array[i]; // 만약 array[i]가 max보다 크다면, max 변수에 해당 값을 할당 즉 제일 높은 값이 나옴.
            }

        }
        System.out.println(min);
        System.out.println(max);
    }
}
