package section5;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit memberInit1 = new MemberInit();
        memberInit1.name = "user1";
        memberInit1.age = 15;
        memberInit1.grade = 90;

        MemberInit memberInit2 = new MemberInit();
        memberInit2.name = "user2";
        memberInit2.age = 16;
        memberInit2.grade = 80;

        MemberInit[] memberInits = {memberInit1, memberInit2};

        for (MemberInit cnt : memberInits) {
            System.out.println("이름:" + cnt.name + " 나이:" + cnt.age + " 성적:" + cnt.grade);
        }
    }
}
