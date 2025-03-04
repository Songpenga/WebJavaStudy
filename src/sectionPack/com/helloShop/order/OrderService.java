package sectionPack.com.helloShop.order;

import sectionPack.com.helloShop.product.Product;
import sectionPack.com.helloShop.user.User;

public class OrderService {

    public void order(){
        User user = new User();
        Product product = new Product();
        Order order = new Order(user,product);
    }
}
