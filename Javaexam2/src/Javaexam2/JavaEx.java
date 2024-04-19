package Javaexam2;
import java.util.Scanner;

public class JavaEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("국어 점수를 입력하세요: ");
        int kor = scanner.nextInt();

        System.out.println("영어 점수를 입력하세요: ");
        int eng = scanner.nextInt();

        System.out.println("수학 점수를 입력하세요: ");
        int math = scanner.nextInt();

        JavaExam2 student = new JavaExam2("", 0, 0, 0, 0, 0);
        student.kor = kor;
        student.eng = eng;
        student.math = math;

        int total = JavaExamTotal.getTotal(student);
        float average = JavaAverage.getAverage(student);

        System.out.println("총점: " + total);
        System.out.println("평균: " + average);
    }
}
