package section7.Ex;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter maxC = new MaxCounter(5);
        int cnt = 0;
        cnt = maxC.getCount();
        System.out.println("cnt = " + cnt);
        maxC.increment();
        maxC.increment();
        maxC.increment();
        maxC.increment();
        maxC.increment();maxC.increment();
        cnt = maxC.getCount();
        System.out.println("cnt = " + cnt);
    }
}
