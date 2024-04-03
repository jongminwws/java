package String;

public class StringEquals {
    public static void main(String[] args) {
        String strVar1 = "신민철";
        String strVar2 = "신민철";
        
        if(strVar1 == strVar2){
            System.out.println("str1과 str2는 참조가 같음");
        }else{
            System.out.println("str1 과 str2는 참조가 다름");
        }
        if(strVar1.equals(strVar2)) {
            System.out.println("str1과 str2는 문자열이 같음");
        }
        
        String strVar3 = new String("신민철"); //객체 생성 연산자 new연산자를 통해 string 객체를 생성시킴
        String strVar4 = new String("신민철");
        
        if (strVar3 == strVar4) { // == 연산자는 변수에 저장된 객체의 번지가 동일한지 검사
            System.out.println("str3과 str4는 참조가 같음");
        }else {
            System.out.println("str3과 str4는 참조가 다름"); // new 연산자로 string 객체로 생성을 했을경우 연산 결과는 false 로 나옴
        }
        
        if(strVar3.equals(strVar4)){
            System.out.println("str3과 str4는 문자열이 같음");
        }
    }
}
