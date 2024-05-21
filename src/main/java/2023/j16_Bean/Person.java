package j16_Bean;

public class Person {

    private final String name; //final : 필수값, 멤버변수에 finla을 선언하면 필수값이 된다.
    private int age;

    // public Person(){} final 이 있어서 빈 생성자는 불가능하다. // NoargsConstructor는 REquiredArgsConstructor와 함꼐 쓸 수 없다.

    public Person(String name) { // <- requiredArgsConstructor
        this.name = name;

    }
    public Person(String name, int age) { // 생성자, <- AllArgsConstructor
        this.name = name;
        this.age = age;


    }

}
