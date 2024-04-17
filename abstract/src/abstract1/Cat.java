package abstract1;

public class Cat extends Animal {
    public Cat() {
        this.kind = "고양이";
    }
    
    @Override // 추상 메소드 재정의
    public void sound() {
        System.out.println("야옹");
    }
    
}
