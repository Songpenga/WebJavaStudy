package section4.Ex;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000);
        account.withdraw(8000);
        account.withdraw(10000);
        System.out.println("잔고 : " + account.bal);
    }
}
