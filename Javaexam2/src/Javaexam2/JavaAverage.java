package Javaexam2;

public class JavaAverage {
    public static float getAverage(JavaExam2 student) {
        return (float) JavaExamTotal.getTotal(student) / 3;
    }
}
