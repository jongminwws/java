package Class;

public class ex1 {
    String title;
    String content;
    String writer;
    String date;
    int hitcount;

    //매겨 변수 2개인 생성자
    ex1(String title,String content){
        this(title,content,"홍길동","2024-04-08",0);
//        this.title = title;
//        this.content = content;
//        this.writer = "로그인 회원";
//        this.date = "현재 날짜";
//        this.hitcount = 0;
    }
    //매겨 변수 3개인 생성자
    ex1(String title,String content,String writer){
        this(title,content,writer,"2024-04-08",0);
//        this.title = title;
//        this.content = content;
//        this.writer = writer;
//        this.date = "현재 날짜";
//        this.hitcount = 0;
    }
    //매겨 변수 4개인 생성자
    ex1(String title,String content,String writer,String date){
        this(title,content,writer,date,0);
//        this.title = title;
//        this.content = content;
//        this.writer = writer;
//        this.date = date;
//        this.hitcount = 0;
    }
    //매겨 변수 5개인 생성자
    ex1(String title,String content,String writer,String date, int hitcount){
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
        this.hitcount = hitcount;
    }
}
