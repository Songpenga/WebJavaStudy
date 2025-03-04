package sectionPack.com.helloShop.order;

import sectionPack.com.helloShop.product.Product;
import sectionPack.com.helloShop.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product){
        this.user = user;
        this.product = product;
    }
}
