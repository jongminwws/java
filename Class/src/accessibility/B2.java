package accessibility; // 패키지 동일

public class B2 {
    public B2 () {
        A2 a = new A2();
        a.field1 = 1;
        a.field2 = 2;
//        a.field3 = 3; // private 필드 접근 불가 컴파일 에러

        a.method1();
        a.method2();
//        a.method3(); // private 메소드 접근 불가 컴파일 에러
    }
}
