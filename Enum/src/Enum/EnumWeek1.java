package Enum;

import java.util.Calendar;

public class EnumWeek1 {
    public static void main(String[] args) {
        EnumWeek today = null; // 열거 타입 변수 선언

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK); // 일(1)~토(7)까지 숫자로 리턴

        System.out.println(week);

        switch (week){
            case 1 :
                today = EnumWeek.Sunday; // 열거 상수 대입
                break;
            case 2 :
                today = EnumWeek.Monday;
                break;
            case 3 :
                today = EnumWeek.Tuesday;
                break;
            case 4 :
                today = EnumWeek.Wednesday;
                break;
            case 5 :
                today = EnumWeek.Thursday;
            case 6 :
                today = EnumWeek.Friday;
            case 7 :
                today = EnumWeek.Saturday;
        }
        System.out.println("오늘 요일" + today);
        
        if (today == EnumWeek.Sunday){
            System.out.println("일요일 에는 축구를 함");
        }else {
            System.out.println("열심히 자바 공부 합시다");
        }


    }
}
