package Array;

public class Array1 {
    public static void main(String[] args) {
        int [] score = {78,70,90};

        System.out.println(score[0]);
        System.out.println(score[1]);
        int sum1 =0;
        for (int i = 0; i<3;i++){
            sum1 += score[i];
        }
        System.out.println(sum1);
        double avg = (double) sum1 / 3;
        System.out.println(avg);
        String [] name = null;
        name = new String[] {"장종만","김민지"};


    }

}
