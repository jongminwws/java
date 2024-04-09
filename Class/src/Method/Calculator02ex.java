package Method;

public class Calculator02ex {
    public static void main(String[] args) {
        Calculator02 mycal = new Calculator02();
        // 정사각형의 넓이 구하기 인수값(10) 한개이면 매개변수가 한개인것을 호출
        double result1 = mycal.areaRectangle(10);

        // 정사각형의 넓이 구하기 인수값(10,20) 두개이면 매개변수가 두개인것을 호출
        double result2 = mycal.areaRectangle(10,20);

        //결과 출력
        System.out.println("직사각형 : " + result1);
        System.out.println("정사각형 : " + result2);

        // 인수는 두개이나 , 정수 값 두개 (int , int)인 매개변수
        int result3 = mycal.plus(10,20);
        // 인수는 두개이나 , 정수 값 두개 (double , int)인 매개변수
        double result4 = mycal.plus(2.5,10);
        // 인수는 두개이나 , 정수 값 두개 (int , double)인 매개변수
        double result5 = mycal.plus(10,2.5);
        // 인수는 두개이나 , 정수 값 두개 (double , double)인 매개변수
        double result6 = mycal.plus(10.5,10.5);

        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
