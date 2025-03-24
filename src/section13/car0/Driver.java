package section13.car0;

//Driver는 k3Car을 운전하는 프로그램이다.
public class Driver {

    private K3Car k3Car;
    private ModelCar modelCar;

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void setModelCar(ModelCar modelCar) {
        this.modelCar = modelCar;
    }

    public void drive(){
        System.out.println("자동차 운전");
        if (k3Car != null){
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (modelCar != null) {
            modelCar.startEngine();
            modelCar.pressAccelerator();
            modelCar.offEngine();
        }
    }
}
