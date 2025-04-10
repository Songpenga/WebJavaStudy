package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        Address a = new Address("울산");
        Address b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "서울");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    private static void change(Address address, String chgAddress) {
        System.out.println("주소 값 변경 : " + chgAddress);
        address.setVal(chgAddress);
    }
}
