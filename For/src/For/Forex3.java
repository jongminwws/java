package For;

public class Forex3 {
    public static void main(String[] args) {
        for(int i =0;i<=10;i++){
            for(int j=0;j<=10;j++){
                if(4 * i+ 5 * j == 60){
                    System.out.println("("+i+","+j+")");
                }
            }
        }
    }
}
