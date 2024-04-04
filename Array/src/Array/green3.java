package Array;
public class green3 {
    public static void main(String[] args) {
        System.out.println("이름,국어,영어,수학,총점,평균");
        System.out.println("=================================");
        String name[] = {"정자바", "이그린", "컴퓨터", "최씨샵", "씨풀풀"};
        int number[][] = {{90, 95, 98}, {75, 85, 88}, {60, 68, 77}, {82, 63, 84}, {74, 77, 98}};

        for (int i = 0; i < number.length; i++) {
            System.out.print(name[i] + " ");
            int sum = 0;
            double avg = 0;
            for (int j = 0; j < number[i].length; j++) {
                System.out.print(number[i][j]+" ");
                sum += number[i][j];

            }
            avg = (double) sum / number[i].length;
            System.out.print(sum+" ");
            System.out.printf("%.1f",avg);
            System.out.println(" ");
        }
        System.out.println("=================================");
        System.out.print("총점 :");
        int koreanTotal = 0;
        for (int i = 0; i < number.length; i++) {
            koreanTotal += number[i][0];
        }
        System.out.print(koreanTotal + " ");

        int engTotal = 0;
        for (int i = 0; i < number.length; i++) {
            engTotal += number[i][1];
        }
        System.out.print(engTotal+" ");
        int matTotal = 0;
        for (int i = 0; i < number.length; i++) {
            matTotal += number[i][2];
        }
        System.out.print(matTotal+" ");

    }
}


