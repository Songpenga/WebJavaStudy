package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        Address a = new Address("울산");
        Address b = new Address("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setVal("서울"); // b의 값을 부산으로 변경해야함
        System.out.println("부산 ->>> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
