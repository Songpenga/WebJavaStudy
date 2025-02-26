package section4.Ex;

public class RectangleObjectOrientedMain {
    public static void main(String[] args) {
        // Rectangle 객체 생성
        Rectangle rectangle = new Rectangle(10, 20);

        // 메서드를 호출하여 넓이와 둘레를 계산
        int area = rectangle.calculateArea();
        int perimeter = rectangle.calculatePerimeter();

        // 결과 출력
        System.out.println("넓이: " + area);
        System.out.println("둘레: " + perimeter);
    }
}
