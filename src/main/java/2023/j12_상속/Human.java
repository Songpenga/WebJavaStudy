package j12_상속;


public class Human extends Animal
{

    public Human(String name){
        super(name); // 부모의 주소를 가르킨다., 부모가 가지고 있는 객체에 접근한다. 항상 기본적으로 생성되어 있다.항상 위에 존재해야함
        //super.move();
        System.out.println("Human 생성");
    }

    //메소드 오버라이딩(오버라이드)
//    [  재정의  ]
//      상위(animal) 객체의 메소드를 하위(human) 객체에서 다시 정의하는 행위

    @Override // @어노테이션 해당 메소드가 상위 객체로 부터 재정의 된 메소드 입니다를 표기. 특별한 기능은 없다.
    public void move(){

        super.move();
        System.out.println("두 발로 걷습니다.");
    }

    }
