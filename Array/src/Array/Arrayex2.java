package Array;

public class Arrayex2 {
    public static void main(String[] args) {
        int [][] array = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };

        int sum =0;
        double avg =0;
        int count =0;

        for(int i=0;i<array.length;i++) { //2차원 배열에서의 행의 값을 구하기 위한 for문
            for (int j = 0; j < array[i].length; j++) { // 2차원 ㅐㅂ열에서의 열의 값을 구하기 위한 for문
                sum += array[i][j]; // sum  = sum + arry[i][j]

            }
        }
        int x=0;
        for (int i=0;i < array.length;i++){
            x += array[i].length;
        }
        avg = (double) sum / x;

        System.out.println(sum);
        System.out.println(avg);
    }
}
