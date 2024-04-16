package promotion;

public class Carex {
    public static void main(String[] args) {
        Car car = new Car(); // car 객체 생성

        for (int i = 1; i <= 5; i++) {
            int pro = car.run();  // car 객체의 run 메소드 5번 반복실행


            switch (pro) {
                case 1:
                    System.out.println("앞왼쪽 한국타이어로 교체");
                    car.frontLeftTire = new HanKookTire("앞왼쪽", 15); // 앞왼쪽 타이어가 펑크 났을때 한국으로 교체
                    break;
                case 2:
                    System.out.println("앞오른쪽 금호타이어로 교체");
                    car.frontLeftTire = new KumhoTire("앞오른쪽", 13); // 앞오른쪽 타이어가 펑크 났을때 한국으로 교체
                    break;
                case 3:
                    System.out.println("뒤왼쪽 한국타이어로 교체");
                    car.frontLeftTire = new HanKookTire("뒤왼쪽", 14); // 뒤왼쪽 타이어가 펑크 났을때 한국으로 교체
                    break;
                case 4:
                    System.out.println("뒤오른쪽 금호타이어로 교체");
                    car.frontLeftTire = new KumhoTire("뒤오른쪽", 17); // 뒤오른쪽 타이어가 펑크 났을때 금호로 교체
                    break;
            }
            System.out.println("------------------"); // 1회전시 출력되는 내용을 구분
        }
    }
}
