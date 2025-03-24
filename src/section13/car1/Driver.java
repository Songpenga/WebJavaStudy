package section13.car1;

//Driver는 k3Car을 운전하는 프로그램이다.
public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다 " + car);
        this.car = car;
    }

    public void drive(){
        System.out.println("자동차 운전 start" + car);
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
