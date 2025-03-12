package section8.static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello peng";
        DecoUtil1 utils1 = new DecoUtil1();
        String deco = utils1.deco(s);

        System.out.println("befor : " + s);
        System.out.println("after : " + deco);
    }
}
