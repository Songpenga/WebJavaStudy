package section5;

public class MemberConstruct {
    String name;
    int age;
    int grade;


    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 : " + name);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
