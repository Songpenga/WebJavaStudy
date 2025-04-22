package lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int val = 10;
        int i1 = compareTo(val, 5);
        int i2 = compareTo(val, 10);
        int i3 = compareTo(val, 15);

        System.out.println("i1 ::: " + i1);
        System.out.println("i2 ::: " + i2);
        System.out.println("i3 ::: " + i3);
    }

    private static int compareTo(int a, int b) {
        if(a < b){
            return -1;
        }else if(a > b){
            return 1;
        }else{
            return 0;
        }

    }
}
