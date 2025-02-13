package section3.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("주문 개수 :");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];

        for (int i = 0; i < orders.length; i++){
            System.out.println((i+1) + "번쨰 주문 정보 입력");

            System.out.println("상품명 : ");
            String product = scanner.nextLine();

            System.out.println("가격 : ");
            int price = scanner.nextInt();

            System.out.println("수량 : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();//입력 버퍼를 비우기 위한 코드

            orders[i] = createOrder(product, price, quantity);
        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders); // ctrl + alt + v

        System.out.println("총 : " + totalAmount);

    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("productName : " + order.productName);
            System.out.println("price : " + order.price);
            System.out.println("quantity : " + order.quantity);
        }

    }

    static int getTotalAmount(ProductOrder[] orders){
        int cnt = 0;
        for (ProductOrder order : orders) {
            cnt += order.price * order.quantity;
        }
        return cnt;
    }
}
