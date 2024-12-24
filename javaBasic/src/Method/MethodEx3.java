package Method;

public class MethodEx3 {
    public static void main(String[] args) {
        int bal = 10000;

        //입금
        int depositAmt = 1000;
        bal = deposit(bal, depositAmt);
        bal = withdraw(bal, 2000);

        //출금
        int withD = 4000;
        bal = withdraw(bal, withD);
    }
    
    public static int deposit(int bal, int amt){
        bal += amt;
        System.out.println(amt + "원을 입금하였습니다. " +
                "현재잔액 : " + bal + "원");

        return bal;
                
    }

    public static int withdraw(int bal, int amt) {
        if (bal >= amt) {
            bal -= amt;
            System.out.println(amt + "원을 출금하였습니다." +
                    "현재 잔액 : " + bal + "원"
            );
        } else {
            System.out.println(amt + "원을 출금하려 했으니 잔액이 부족합니다.");
        }
        System.out.println("최종잔액 : " + bal + "원");

        return bal;
    }
}
