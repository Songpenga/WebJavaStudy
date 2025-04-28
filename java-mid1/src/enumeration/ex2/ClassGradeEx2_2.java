package enumeration.ex2;

public class ClassGradeEx2_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        //ClassGrade newClassGrade = new ClassGrade(); //x009 >> 생성자 추가 후 오류
        //int result = discountService.discount(newClassGrade, price);
        //System.out.println("newClassGrade 등급의 할인 금액: " + result);
    }
}
