package section7.Ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCnt;

    public void addItem(Item item){
        if(itemCnt >= items.length){
            System.out.println("장바구니에 더 이상 담을 수 없습니다.");
            return;
        }

        items[itemCnt] = item;
        itemCnt++;
    }

    public void displayItems(){
        System.out.println("장바구니 내역");
        for(int i = 0; i < itemCnt; i++){
            Item item = items[i];
            System.out.println("상품명 : " + item.getItemName() + ", 합계 : " + item.totalPrice());
        }
/*        for (int i : itemCnt) { //Foreach not applicable to type 'int'

        }*/

        System.out.println("총 가격 : " + shoppingTotalPrice());
    }

    private int shoppingTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCnt; i++) {
            Item item = items[i];
            totalPrice += item.totalPrice();
        }
        return totalPrice;
    }
}
