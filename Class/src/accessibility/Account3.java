package accessibility;

public class Account3 {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(10000); // 현재 잔고
        System.out.println(account.getBalance());

        account.setBalance(12500);
        System.out.println(account.getBalance());

        account.setBalance(10000000); // 100만보다 크니깐 이전 값 출력 1
        System.out.println(account.getBalance());

        account.setBalance(-10000000); // 0보다 작으니깐 이전 값 출력
        System.out.println(account.getBalance());
    }
}
