package If;

public class Ifesle {
    public static void main(String[] args) {
        int score = 75;
        if (score > 90) {
            System.out.println("점수는 100~90");
            System.out.println("등급은 A");
        }else if (score > 80) {
            System.out.println("점수는 89~80");
            System.out.println("등급은 B");
        }else if (score > 70) {
            System.out.println("점수는 79~70");
            System.out.println("등급은 C");
        }else {
            System.out.println("점수는 70미만");
            System.out.println("등급은 D");
        }
        int x = 2;
        int y = 5;
        char c = 'A';
        System.out.println(1+x <<33);
        System.out.println(y >=5 || x <0 && x >2);
        System.out.println(y +=10 - x++);
        System.out.println(x+=2);
        System.out.println(!('A' <=c && c <='Z'));
        System.out.println('C'-c);
        System.out.println('5'-'0');
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);
    }
}
