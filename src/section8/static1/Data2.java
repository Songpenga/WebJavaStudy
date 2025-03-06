package section8.static1;

public class Data2 {
    public String name;

    public Data2(String name, Counter cnt) {
        this.name = name;
        cnt.count++;
    }
}
