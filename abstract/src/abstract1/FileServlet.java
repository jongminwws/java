package abstract1;

public class FileServlet extends  HttpServlet {
    public void service() { // 오버라이딩 된거 (재정의)
        System.out.println("파일 다운로드 합니다");
    }
}
