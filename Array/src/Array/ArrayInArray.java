package Array;

public class ArrayInArray {
    public static void main(String[] args) {
        int [][] mathsc = new int[2][3];
        for(int i=0;i<mathsc.length;i++){
            for (int k=0;k<mathsc[i].length;k++){
                System.out.println(mathsc[i][k]);
            }
        }
        System.out.println();
        int [][] englsc= new int[2][];
        englsc [0] = new int[2];
        englsc[1] = new int[3];
        for(int i=0;i<englsc.length;i++){
            for (int k=0;k<englsc[i].length;k++){
                System.out.println(englsc[i][k]);
            }
        }
        System.out.println();

        int[][] javasc = { {95,80},{92,69,80}};
        for(int i=0;i<javasc.length;i++){
            for (int k=0;k<javasc[i].length;k++){
                System.out.println(javasc[i][k]);
            }
        }
    }
}
