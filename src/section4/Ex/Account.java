package section4.Ex;

public class Account {
    int bal; //잔액

    void deposit(int amount){
        bal += amount;
        System.out.println("잔액 : " + bal);
    }

    void withdraw(int amount){
        if(bal >= amount){
            bal -= amount;
            System.out.println("잔액 : " + bal);
        }else{
            System.out.println("잔액부족");
            System.out.println("잔액 : " + bal);
        }
    }
}
