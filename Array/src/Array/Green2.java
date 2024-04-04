package Array;

import java.util.Scanner;

public class Green2 {
    public static void main(String[] args) {
        boolean run = true;
        int max = 0;
        int sum = 0;
        double avg = 0;
        int[] scores = new int[5]; // 크기가 5인 배열을 생성 만약 무한대면?

        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("선택>");

                    for (int i = 0; i < scores.length; i++) {
                        System.out.println((i+1)+"번째 학생점수를 입력하세요:");
                        scores[i] = Integer.parseInt(scanner.nextLine());
                        sum += scores[i]; // 입력받은 값을 더함
                        if (scores[i] > max) {
                            max = scores[i]; // 최고점수
                        }
                    }
                    avg = (double) sum / scores.length;
                    System.out.println("최고 총점은 : " + sum);
                    System.out.println("평균은 : " + avg);
                    System.out.println("최고 점수는 : " + max);
                    run = false;

            }
        }
    }

