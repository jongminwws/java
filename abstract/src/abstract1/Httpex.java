package abstract1;

public class Httpex {
    public static void main(String args[]) {
        method(new LoginServlet());
        method(new FileServlet());
    }
    public static void method(HttpServlet servlet){
        servlet.service();
    }
}
