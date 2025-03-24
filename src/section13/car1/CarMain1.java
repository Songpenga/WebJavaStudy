package section13.car1;

public class CarMain1 {

    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량선택 : k3
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        //차량변경 k3 => modelCar
        ModelCar modelCar = new ModelCar();
        driver.setCar(modelCar);
        driver.drive();

        //차량변경 modeCar => newCar
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
