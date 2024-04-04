package Array;

import java.util.Scanner;

public class Arrayex3 {
        public static void main(String[] args) {
            boolean run =true;

            int students = 0;
            int scores = 0;
            int max =0;
            int sum =0;
            double avg =0;

            int [] score= null;
            Scanner scanner = new Scanner(System.in); // 스캐너 : 사용자가 입력한 값 받기
            while (run) {
                System.out.println("---------------");
                System.out.println("1.학생수 || 2.점수입력 || 3.점수리스트 ||4.분석 || 5.종료");
                System.out.println("---------------");
                System.out.println("선택>");
                int choice = Integer.parseInt(scanner.nextLine()); // choice 스캐너를 통해서 입력한 값이 스위치를 통해서 나온다 1번을 입력하면 case 1이 출력됨
                switch (choice) {
                    case 1:
                        System.out.println("학생수를 입력하세요: ");
                        students = Integer.parseInt(scanner.nextLine()); // 학생 수를 스캐너를 통해서 입력
                        score = new int[students]; // 입력받은 학생 수만큼 배열을 생성하여 학생들의 점수를 저장할 준비
                        break;

                    case 2:
                        for (int i=0; i < score.length;i++) { // 만약 i가 스코어 길이보다 작으면 i값이 증가 즉 학생수가 몇명
                            System.out.println((i+1)+"번 학생의 점수 : ");
                            score[i] = Integer.parseInt(scanner.nextLine()); // 스코어 배열에 점수를 입력
                        }
                        break;
                    case 3:
                        for(int i=0; i < score.length;i++) {  //만약 i가 스코어 길이보다 작으면 i값이 증가 즉 학생수가 몇명
                            System.out.println((i+1)+"번 학생의 점수 : ");
                            System.out.println(score[i]); // 케이스 2번에서 입력한 스코어 점수 그래도 출력하는 것
                        }
                        break; // 종료
                    case 4:
                        //최고 점수
                        for (int i = 0; i < score.length; i++) {
                            if(score[i] > max){ // 현재 인덱스 i에 해당하는 배열 요소가 max보다 큰지를 확인
                                max = score[i]; // 만약 array[i]가 max보다 크다면, max 변수에 해당 값을 할당 즉 제일 높은 값이 나옴.
                            }
                            sum += score[i]; // 총점수 구하기 sum변수에 내가 입력한 스코어 점수
                        }
                        avg = (double) sum / students;
                        System.out.println("최고 총점은 : ");
                        System.out.println(sum);
                        System.out.println("평균은 : ");
                        System.out.println(avg);
                        System.out.println("최고 점수는 : ");
                        System.out.println(max);
                        //평균
                        break; // 종료
                    default:
                        System.out.println("프로그램 종료");
                        run = false;
                        break;
                }
            }
                    scanner.close();
                }
            }
