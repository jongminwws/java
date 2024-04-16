package promotion;

public class Childex {
    public static void main(String[] args) {
        Child child = new Child();
        
         Parent parent = child;// 자동타입 변환
//        Parent.method1();
//        Parent.method2(); // 재정의된 메소드가 호출됨
    }
}
