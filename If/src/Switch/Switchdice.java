package Switch;

public class Switchdice {
    public static void main(String[] args) {
        int num = (int) (Math.random()*6)+1;

        switch (num){
            case 1:
                System.out.println("숫자1");
                break;
            case 2:
                System.out.println("숫자2");
                break;
            case 3:
                System.out.println("숫자3");
                break;
            case 4:
                System.out.println("숫자4");
                break;
            case 5:
                System.out.println("숫자5");
                break;
            case 6:
                System.out.println("숫자6");
                break;

        }
    }
}
