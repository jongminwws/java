package TypeChange;

public class PromotionExample {
    public static void main(String[] args) {
        byte bytevalue = 10;
        System.out.println("intvalue :" + bytevalue);
        char charvalue = '가';
        System.out.println("가의 유니코드" + charvalue);
        int intvalue = 50;
        long longvalue = (long)intvalue; //
        System.out.println("longvalue" + longvalue);
        longvalue = 100L;
        float floatvalue = (float)longvalue;
        System.out.println("float :" + floatvalue);
        floatvalue = 100.5F;
        double doublevalue = (double)floatvalue;
        System.out.println("double " + doublevalue);
    }
}
