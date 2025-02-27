package section5.Ex;

public class BookMain {

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("test book title", "peng");
        book2.displayInfo();

        Book book3 = new Book("test book title2", "PENG!!", 500);
        book3.displayInfo();
    }

}
