package While;

public class BreakLabel {
    public static void main(String[] args) {
        Outter: for(char x = 'A'; x <='Z';x++){
        for(char lower ='a';lower <='z';lower++) {
            System.out.println(x + "-"+lower);
            if(lower == 'g'){
                break Outter;
            }
        }
        }
        System.out.println("프로그램 종료");
    }
}
