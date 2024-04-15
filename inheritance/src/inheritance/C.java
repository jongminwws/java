package inheritance;
import inheritance.A;
public class C {
    public void method() {
        A a = new A();
        a.field="value"; // 접근 가능
        a.method();
    }
}
