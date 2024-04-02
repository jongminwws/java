package Switch;

public class BreakNoCase {
    public static void main(String[] args) {
        int num = (int) (Math.random()*4)+8;
        System.out.println("현재시간 :" + num + "시");
        
        switch (num){
            case 8:
                System.out.println("출근");
            case 9:
                System.out.println("회의");
            case 10:
                System.out.println("업무");
            case 11:
                System.out.println("점심");
        }
    }
}
