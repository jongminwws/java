package Array;

public class Arraylength {
    public static void main(String[] args) {
        int [] score = {83,70,80};

        int sum = 0;
        for(int i=0;i<score.length;i++){
            sum+=score[i];
        }
        System.out.println(sum);

        double avg = (double) sum / score.length; // 3
        System.out.println(avg);
    }
}
