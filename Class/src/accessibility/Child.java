package accessibility;

public class Child  extends Parent{
    private String name;

    public Child() { //메인에서 실행을 시키면 이 생성자 가 호출이 되지만 막상 실행은 맨 마지막에 출력이 된다.
        //super(); // super 는 부모 클래스를 불러옴 그래서 parent 가 실행됨
        this("홍길동"); // parent 생성자가 모두 출력이 됐다면 다시 child 로 넘어옴 하지만 여기 this 는 밑에 생성자를 호출
        System.out.println("child() call"); // 밑에 문장이 출력이 된다면 지금 이 문장이 출력됨
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name)call"); // 마찬가지로 이 문장이 출력됨
    }
}
