package If;

public class dice {
    public static void main(String[] args) {
        int num = (int) (Math.random()*6)+1;

        if (num == 1){
            System.out.println("숫자 1");
        }else if(num == 2){
            System.out.println("숫자2");
        } else if (num == 3) {
            System.out.println("숫자3");
        } else if (num == 4) {
            System.out.println("숫자4");
        } else if (num == 5) {
            System.out.println("숫자5");
        }else {
            System.out.println("숫자6");
        }
    }
}
