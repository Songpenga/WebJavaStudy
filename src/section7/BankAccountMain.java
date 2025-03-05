package section7;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acnt = new BankAccount();
        acnt.deposit(10000);
        acnt.withdraw(3000);;
        System.out.println("bal = " + acnt.getBal());
    }
}
