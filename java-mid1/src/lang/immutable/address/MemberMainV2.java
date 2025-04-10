package lang.immutable.address;

public class MemberMainV2 {


    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberV1 = new MemberV2("회원1", address);
        MemberV2 memberV2 = new MemberV2("회원2", address);

        //회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberV1 : " + memberV1);
        System.out.println("memberV2 : " + memberV2);

        //회원B의 주소를 부산으로 변경해야함
        //memberV2.getAddress().setVal("울산"); //컴파일 오류
        memberV2.setAddress(new ImmutableAddress("울산"));
        System.out.println("울산 >> memberB.address");
        System.out.println("memberV1 : " + memberV1); //String can be replaced with template
        System.out.println("memberV2 : " + memberV2);
    }
}
