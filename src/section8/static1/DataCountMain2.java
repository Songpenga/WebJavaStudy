package section8.static1;

public class DataCountMain2 {

    public static void main(String[] args) {
        Counter cnt = new Counter();
        Data2 data1 = new Data2("A", cnt);
        System.out.println("A = " + cnt.count);

        Data2 data2 = new Data2("B", cnt);
        System.out.println("B = " + cnt.count);

        Data2 data3 = new Data2("C", cnt);
        System.out.println("C = " + cnt.count);

        /* 250306
         * Data2 인스턴스를 생성하면 생성자를 통해
         * Counter 인스턴스에 있는 count 값을 하나 증가시킨다.
         * Main -> Data2 -> count
         */


    }
}
