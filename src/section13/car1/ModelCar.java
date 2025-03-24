package section13.car1;

public class ModelCar  implements Car{
    @Override
    public void startEngine() {
        System.out.println("ModelCar >> startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("ModelCar >> offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("ModelCar >> pressAccelerator");
    }
}
