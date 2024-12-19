package Method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean retult = odd(2);
        System.out.println(retult);
    }

    public static boolean odd(int i){
        if(i % 2 == 1){
            return true;
        }else{
            return false; // 꼭 있어야함
        }

        //missing return statement
    }

}
