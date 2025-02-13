package section2.ex;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        ProductOreder[] orders = new ProductOreder[3];

        ProductOreder oreder1 = new ProductOreder();
        oreder1.productName = "프로틴";
        oreder1.price = 32000;
        oreder1.quantity = 1;
        orders[0] = oreder1;

        ProductOreder oreder2 = new ProductOreder();
        oreder2.productName = "브로콜리";
        oreder2.price = 7800;
        oreder2.quantity = 4;
        orders[1] = oreder2;

        ProductOreder oreder3 = new ProductOreder();
        oreder3.productName = "카레";
        oreder3.price = 2300;
        oreder3.quantity = 2;
        orders[2] = oreder3;

        for (ProductOreder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }
}
