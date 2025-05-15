package section8.nested.ex2;

import section8.nested.ex1.Engine;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    //Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }

    //Engine에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start(){
        engine.start();
        System.out.println(model + " start ");
    }

    private class Engine{
    /*
        엔진을 내부 클래스로 만들었다.Engine.start() 를 기존과 비교해보자.
        Car 의 인스턴스 변수인 chargeLevel 에 직접 접근할 수 있다.
        Car 의 인스턴스 변수인 model 에 직접 접근할 수 있다.
    */
        public void start(){
            System.out.println(
                    "충전 레벨 확인 : " + chargeLevel
            );

            System.out.println(
                    model + " 의 엔진을 구동합니다."
            );
        }
    }
}
