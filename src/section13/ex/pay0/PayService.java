package section13.ex.pay0;

public class PayService {

    public void processPay(String option, int amount){

        boolean result;
        System.out.println("결제를 진행합니다. option : " + option + ", 결제금액 : " + amount);

        if (option.equals("kakao")){
            KakaoPay kakaoPay = new KakaoPay();
            result = kakaoPay.pay(amount);
        } else if (option.equals("naver")) {
            NaverPay naverPay = new NaverPay();
            result = naverPay.pay(amount);
        }else{
            System.out.println("결제수단이 없습니다.");
            result = false;
        }

        if(result){
            System.out.println("결제 성공");
        }else {
            System.out.println("결제 실패");
        }

    }
}
