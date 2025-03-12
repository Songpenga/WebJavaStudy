package section8.static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello peng";
        String deco = DecoUtil2.deco(s);

        System.out.println("befor : " + s);
        System.out.println("after : " + deco);
    }
}
