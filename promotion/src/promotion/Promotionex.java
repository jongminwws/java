package promotion;
class A {}
class  B extends A {}
class C extends A {}

class D extends B {}

class E extends C {}
public class Promotionex {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b; // b클래스를 a클래스로 변환(부모>자식)
        A a2 = c; // c클래스를 a클래스로 변환(부모>자식)
        A a3 = d; // d클래스를 a클래스로 변환(부모>자식)
        A a4 = e; // e클래스를 a클래스로 변환(부모>자식)

        B b1 = d; // d클래스를 b클래스로 변환(부모>자식)
        C c1 = e; // e클래스를 c클래스로 변환(부모>자식)

        //B b3 = e; 상속관계에 있지 않기 때문에 컴파일 에러
        //C c2 = d; 상속관계에 있지 않기 때문에 컴파일 에러
    }

}
