package section4.Ex;

//절차지향
public class RectangleProceduralMain {
    public static void main(String[] args) {
        int width = 10;
        int height = 20;

        int area = calculateArea(width, height);
        int perimeter = calculatePerimeter(width, height);

        System.out.println("넓이: " + area);
        System.out.println("둘레: " + perimeter);
    }

    public static int calculateArea(int width, int height) {
        return width * height;
    }

    public static int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }
}
