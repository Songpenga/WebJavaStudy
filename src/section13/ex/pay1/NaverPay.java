package section13.ex.pay1;

public class NaverPay implements Pay {
    @Override
    public boolean pay(int amount){
        System.out.println("네이버페이 system과 연결합니다");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
