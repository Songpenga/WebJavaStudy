package j12_상속;

public class Animal {
//1031-2
    public void move(){
        System.out.println("움직입니다.");

    }

    public String name;

    public Animal(String name){
        System.out.println("Animal 생성");
    }

    public String getName(){
        return name;
    }

    public String setName(){
        return name;
    }

}
