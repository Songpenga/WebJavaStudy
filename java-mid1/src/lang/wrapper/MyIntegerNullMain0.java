package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 1, 0, 1, 2, 3};

        System.out.println(findVal(intArr, -1)); //-1
        System.out.println(findVal(intArr, 0));
        System.out.println(findVal(intArr, 1));
        System.out.println(findVal(intArr, 100)); //-1
    }
    //findValue() 는 배열에 찾는 값이 있으면 해당 값을 반환하고, 찾는 값이 없으면 -1 을 반환한다.
    private static int findVal(int[] intArr, int i) {
        for (int val : intArr) {
            if(val == i){
                return val;
            }
        }
        return -1;
    }
}
