package For;

public class Forex2 {
    public static void main(String[] args) {
            int i=0;
            while (i<5){
                int x = (int) (Math.random()*4)+1;
                int y = (int) (Math.random()*4)+1;
                System.out.println("("+x+","+y+")");
                if(x+y  == 5){
                    System.out.println("끝");
                    break;
                }
                i++;
            }
        }

    }

