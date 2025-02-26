package section4.Ex;

class Rectangle {
    // 필드 (속성)
    private int width;
    private int height;

    // 생성자
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // 넓이 계산 메서드
    public int calculateArea() {
        return width * height;
    }

    // 둘레 계산 메서드
    public int calculatePerimeter() {
        return 2 * (width + height);
    }

    // Getter 메서드 (필요시)
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

