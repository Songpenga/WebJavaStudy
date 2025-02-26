package section5;

public class MemberInit {
    String name;
    int age;
    int grade;

    //this 추가
    //멤버 변수보다 매개변수가 코드 블럭의 더 안쪽에 있기 때문에 매개변수가 우선순위를 가진다.
    //따라서 initMembers메서드 안에서 name이라고 적으면 매개변수에 접근하게 된다.
    //멤버 변수에 접근하려면 앞에 this. 이라고 해주면 된다. 여기서 this는 인스턴스 자신의 참조값을 가리킨다.
    void initMembers(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
