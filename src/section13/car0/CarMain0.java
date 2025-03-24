package section13.car0;

public class CarMain0 {
    //다형성을 사용하지 않고, 역할과 구현을 분리하지 않고 단순하게 개발한 케이스

    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();

        //추가
        ModelCar model3Car = new ModelCar();
        driver.setK3Car(null);
        driver.setModelCar(model3Car);
        driver.drive();
    }

    /*
    * K3를 운전하던 운전자가 Model3로 차량을 변경해서 운전하는 코드이다
    *   driver.setK3Car(null) 를 통해서 기존 K3Car의 참조를 제거한다.
        driver.setModelCar(model3Car)를 통해서 새로운 model3Car의 참조를 추가한다.
        driver.drive() 를 호출한다.
    */

    //여기서 새로운 차량을 추가한다면 또 다시 Driver 코드를 많이 변경해야 한다.
    //만약 운전할 수 있는 차량 종류가 계속 늘어난다면 점점 더 변경해야 하는
    //코드가 많아질 것이다.
}
