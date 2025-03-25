package section13.ex.pay0;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao
        String payoptionK = "kakao";
        int amount1 = 5000;
        payService.processPay(payoptionK, amount1);

        String payoptionN = "naver";
        int amount2 = 15000;
        payService.processPay(payoptionN, amount2);

        String payoptionE = "hey";
        int amountE = 25000;
        payService.processPay(payoptionE, amountE);

    }
}
