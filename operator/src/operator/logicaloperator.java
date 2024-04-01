package operator;

public class logicaloperator {
    public static void main(String[] args) {
        int charcode = 65;
        if (charcode >= 65 & charcode <= 90) {
            System.out.println("대문자군요");
        }

        if (charcode >= 97 && charcode <= 127) {
            System.out.println("소문자군요");
        }

        if (charcode >= 48 && charcode <= 57) {
            System.out.println("숫자네");
        }

        int value = 6;
        if (value % 2 == 0 | value % 3 == 0) {
            System.out.println("2 또는 3의 배수");
        }

        if (value % 2 == 0 || value % 3 == 0) {
            System.out.println("2또는 3의 배수");
        }

    }
}