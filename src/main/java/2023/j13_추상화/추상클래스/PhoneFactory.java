package j13_추상화.추상클래스;
//1031
public class PhoneFactory extends Factory { //생성자를 정의해야됨 ctrl + o
    public PhoneFactory(String name) {
        super(name);
}

    @Override
    public void produce(String model) { //추상화에서 선언되지 않은 메소드
        System.out.println(model + "모델 태블릿을 생산합니다.");
    }
    @Override
    public void management(){
        System.out.println("태블릿 공장을 관리합니다.");

    }
}
