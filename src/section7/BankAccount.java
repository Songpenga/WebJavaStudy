package section7;

public class BankAccount {

    private int bal;

    public BankAccount(){
        bal = 0;
    }

    //public 메서드: deposit
    public void deposit(int amount){
        if(isAmountValid(amount)){
            bal += amount;
        }else {
            System.out.println("유효하지 않은 금액 입니다.");
        }
    }

    //public : withdraw
    public void withdraw(int amount){
        if(isAmountValid(amount) && bal - amount >= 0){
            bal -= amount;
        }else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    public int getBal(){
        return bal;
    }

    private boolean isAmountValid(int amount){
        //금액이 0보다 커야함
        return amount > 0;
    }

}
