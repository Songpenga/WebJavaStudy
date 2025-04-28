package enumeration.ex3;

public class ClassGradeEx3_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

/*        Grade grade = new Grade(); // enum 생성 불가
        double result = discountService.discount(grade, price);
        System.out.println("result price: " + result);*/
    }
}
