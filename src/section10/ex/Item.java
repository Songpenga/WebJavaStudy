package section10.ex;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void print(){
        System.out.println("name : " + name + " 가격 : " + price);
    }
}
