package j12_상속;

public class Tiger extends Animal{
    public Tiger(String name) {
        super(name);
    } //메소드 오버 라이딩

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String setName() {
        return super.setName();
    }

    @Override
    public void move() {
        super.move(); //ctrl + space
        //ctrl + o + shift 다중선택

    }
}
