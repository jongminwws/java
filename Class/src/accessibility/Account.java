package accessibility;
//    1.은행계좌 객체 account 객체는 잔고 필드를 가진다.
//     잔고 필드는 음수값이 될 수 없고,최대 백만 원 까지 저장한다
//     외부에서 잔고 필드를 마음대로 변경하지 못하도록 하고,
//     0 <= 잔고 < = 1,000,000 범위의 값만 가질수ㄹ 있도록 어카운트 클래스 작성
//    Setbalacne , getbaclane 메소드를 이용
//    0과1,000,000은 min ,max 상수를 선언해서 이용
//    setter 의 매개값이 음수이거나 백만원을 초과하면 햔재 잔고 값을 유지
public class Account {
    // 필드
    private int balance; // 필드는 음수가 될 수 없으며, 최대 백만 원까지 저장 ,  필드를 private 으로 선언하여 외부에서 직접 접근 금지

    // 생성자
    public int getBalance() { // 현재 객체의 잔고를 반환
        return balance;
    }
    
    // 상수선언
    final static int MIN_BALANCE = 0;
    final static int MAX_BALANCE = 1000000;

    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) { // 입력한 밸런스 값이 0보다 크고 100만 보다 작으면 그 값을 밸런스에 넣음
            this.balance = balance;
        }
    }
}
