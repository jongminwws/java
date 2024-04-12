package accessibility;

import accessibility.*;
public class C2 {
    public C2() {
        A2 a =new A2();
        a.field1 = 1;
        a.field2 = 2; // default 필드 접근 불가 컴파일 에러
//        a.field3 = 3; // private 필드 접근 불가 컴파일 에러

        a.method1();
        a.method2(); // default 메소드 접근 불가 컴파일 에러
//        a.method3(); // private 메소드 접근 불가 컴파일 에러

    }
}
