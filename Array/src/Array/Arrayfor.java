package Array;

public class Arrayfor {
    public static void main(String[] args) {
        int [] sc = {95,70,84,93,97};

        int sum=0;
        for(int sco :sc){
            sum += sco;
        }
        System.out.println(sum);

        double avg = (double) sum/ sc.length;
        System.out.println(avg);
    }
}
