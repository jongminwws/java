package Method;

public class MemberServiceex1 {
    public static void main(String[] args) {
        MemberService myme = new MemberService();
        boolean result = myme.login("홍길동","1234");
        if(result) {
            System.out.println("로그인 되었습니다");
            myme.logout("hong");
        }else {
            System.out.println("id랑 pas가 올바르지 않음");
        }
    }
}
