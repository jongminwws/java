package inheritance;

public class A {
        protected String field; // protected 접근 제한 권한이 있는 필드

        protected A(){ // protected 접근 제한 권한이 있는 생성자
        }
        protected void method() { //protected 접근 제한 권한이 있는 메서드
        }
        
        String field2; // default 접근 제한 권한이 있는 필드
        A(String fiedl) { // default 접근 제한 권한이 있는 생성자
            
        }
        void method2() { // default 접근 제한 권한이 있는 메서드
            
        }
        
}
