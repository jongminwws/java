package inheritance;

public class DmbCellPhoneEx {
    public static void main(String[] args) {
        //Dmbcellphone 객체 생성
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정", 10);

        //cellphone 클래스로 부터 상속받은 필드
        System.out.println(" 모델 :" + dmbCellPhone);
        System.out.println("색상 :" + dmbCellPhone);

        //Dmbcellphone 클래스 필드
        System.out.println("채널 :" + dmbCellPhone.channel);

        //cellphone 클래스로부터 상속받은 메소드 호출
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요");
        dmbCellPhone.sendVoice("반가워요");
        dmbCellPhone.hangUp();

        // dmbcellphone 클래스의 메소드 호출
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();
    }
}
