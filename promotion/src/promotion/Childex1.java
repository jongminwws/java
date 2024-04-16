package promotion;

public class Childex1 {
    public static void main(String[] args) {
        Parent1 parent1 = new Child1(); // 자동타입 변환
        parent1.field1 = "data1";
        parent1.method1();
        parent1.method2();
        /*
        parent1.field2 = "data2";
        parent1.method3(); 
        둘다 불가능
         */
        Child1 child1 = (Child1) parent1; // 강제 타입 변환
        child1.field2 = "yyy"; // 가능
        child1.method3();
    }
}
