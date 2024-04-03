package Array;

public class ArrayCopy {
    public static void main(String[] args) {
        int [] old = {1,2,3};
        int [] newary = new int[5];
        for (int i=0;i<old.length;i++){
            newary[i] = old[i];
        }
        for (int i=0; i<old.length;i++){
            System.out.println(newary[i]);
        }
    }
}
