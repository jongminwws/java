package Array;

public class ArrayCopy1 {
    public static void main(String[] args) {
        String [] old = {"java","array","copy"};
        String[] newarray =  new String[5];
        System.arraycopy(old,0,newarray,0,old.length);

        for (int i=0; i<newarray.length;i++){
            System.out.println(newarray[i]);
        }
    }
}
