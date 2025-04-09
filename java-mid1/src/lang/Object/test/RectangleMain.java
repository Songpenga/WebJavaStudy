package lang.Object.test;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(100, 200);
        Rectangle rec2 = new Rectangle(100, 300);
        Rectangle rec3 = new Rectangle(100, 200);

        System.out.println(rec1);
        System.out.println(rec2);
        System.out.println(rec3);

        System.out.println(rec1 == rec2);
        System.out.println(rec1.equals(rec2));

        System.out.println(rec1 == rec3);
        System.out.println(rec1.equals(rec3));


    }
}
