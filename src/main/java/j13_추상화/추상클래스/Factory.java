package j13_추상화.추상클래스;
/*
*  abstract 추상적인
*
* 추상클래스
* 1. 추상 메소드가 하나라도 포함되면 해당 클래스는
* 추상클래스로 정의되어야한다.
2 추상 클래스는 생성할 수 없다.
3.그 외의 다른 특징은 일반 클래스와 동일하다.
* */

public abstract class Factory { //public abstract 와 선언은 함께 이뤄져야한다.

    private String name;

    public Factory(String name){
        this.name = name;
    }
    public abstract void produce(String model); //추상적인
    public abstract void management();

    public String getName() {
        return name;
    }


    public void printInfo(){
        System.out.println("공장의 정보를 출력합니다.");
        System.out.println("공장이름 :" + name);
    }



}
