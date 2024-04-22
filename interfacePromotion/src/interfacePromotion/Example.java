package interfacePromotion;

public class Example {
    public static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;
        ia.methodA(); // A변수는 메서드 A만 호출가능
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();// B변수는 메서드 A만 호출가능
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA(); // interfaceC 변수는 메소드 a,b,c 모두 호출가능
        ic.methodB();
        ic.methodC();
    }
}
