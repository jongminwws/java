package Array;

public class Green {
    public static void main(String[] args) {
        int score [] = {80,74,63,97,88};
        int sum=0;
        double avg =0.0;
        for(int i =0;i < score.length;i++){
            sum += score[i];

        }
        int max =0;
        for (int i=0;i< score.length;i++){
            if(score[i] > max){
                max = score[i];
            }
        }

        avg = (double) sum / score.length;
        System.out.println(sum);
        System.out.println(avg);
        System.out.println(max);


    }
}
