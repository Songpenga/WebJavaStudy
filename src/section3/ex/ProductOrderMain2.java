package section3.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];


        orders[0] = createOrder("프로틴", 32000, 1);
        orders[1] = createOrder("브로콜리", 7000, 2);
        orders[2] = createOrder("카레", 2300, 2);
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
