package accessibility;

public class Parent {
    public String nation;

    public Parent() {
        this("대한민국"); // child super 때문에 이 생성자가 실행되지만 여기서 this 는 밑에 있는 메서드를 호출함
        System.out.println("parent() call"); // 밑에 문장이 출력이 되고 나서 지금 문장이 출력이 됨
    }

    public Parent(String nation){
        this.nation = nation;
        System.out.println("parent(String nation)call"); // 그래서 이 문장이 제일 먼저 출력됨
    }
}
