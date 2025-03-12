package section8.Ex;

public class MathArrayUtils {

    private MathArrayUtils(){
        //인스턴스 생성을 막는다.
    }

    public static int sum(int[] cnt){
        int result = 0;
        for (int i : cnt) {
            result += i;
        }
        return result;
    }

    public static double aver(int[] cnt) {
        int result = 0;
        for (int i : cnt) {
            result += i;
        }

        return (double) (result/cnt.length);
    }

    public static int min(int[] cnt) {
        int result = 0;
        for (int i : cnt) {
            if(i < result){
                result = i;
            }
        }
        return result;
    }

    public static int max(int[] cnt) {
        int result = 0;
        for (int i : cnt) {
            if(i > result){
                result = i;
            }
        }
        return result;
    }
}
