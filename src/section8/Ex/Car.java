package section8.Ex;

public class Car {

    static int count;
    String carModel;

    public Car(String carName){
        System.out.println("차량구입, 이름 : " + carName);
        this.carModel = carName;
        count++;
    }
    public static void showTotalCars(){
        System.out.println("구매한 차량 수 : " + count);
    }
}
