package Switch;

public class StringCase {
    public static void main(String[] args) {
        String a = "과장";

        switch (a) {
            case "과장":
                System.out.println("월급이 700");
                break;
            case "부장":
                System.out.println("월급이 10000");
                break;
            default:
                System.out.println("월급 300");
        }
    }
}
