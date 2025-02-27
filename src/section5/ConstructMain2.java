package section5;

public class ConstructMain2 {

    public static void main(String[] args) {
        MemberConstruct m1 = new MemberConstruct("test1", 55, 90);
        MemberConstruct m2 = new MemberConstruct("test2", 11);
        //MemberConstruct m3 = new MemberConstruct(); //컴파일 오류 발생
        // => 생성자를 사용하면 필수값 입력을 보장할 수 있다.

        MemberConstruct[] memberConstructs = {m1, m2};
        for (MemberConstruct cnt : memberConstructs) {
            System.out.println("이름:" + cnt.name + " 나이:" + cnt.age + " 성적:" + cnt.grade);
        }
    }
}
