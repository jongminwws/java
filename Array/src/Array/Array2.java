package Array;

public class Array2 {
    public static void main(String[] args) {
        int [] scores;
        scores = new int[] {11,22,33};
        int sum1 = 0;
        for (int i = 0; i < 3; i++){
            sum1 += scores[i];
        }
        System.out.println(sum1);

        int sum2 = add( new int[] {11,22,33});
        System.out.println(sum2);
        System.out.println();
    }
    public  static int add(int[] score){
        int sum = 0;
        for(int i =0; i<3;i++){
            sum += score[i];
        }
        return sum;
    }
}
