
package section13.ex.pay1;

public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao
        String payoptionK = "kakao";
        int amount1 = 75000;
        payService.processPay(payoptionK, amount1);

        String payoptionN = "naver";
        int amount2 = 15000;
        payService.processPay(payoptionN, amount2);

        //잘못된 결제수단
        String payoptionE = "hey";
        int amountE = 25000;
        payService.processPay(payoptionE, amountE);

        String payoptionNew = "new";
        int amount4 = 55000;
        payService.processPay(payoptionNew, amount4);

    }
}
