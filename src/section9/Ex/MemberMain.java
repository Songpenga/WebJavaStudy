package section9.Ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("IdTest", "Peng");
        member.print();
        member.changeData("IdTest2", "Peng22");
        member.print();
    }
}
