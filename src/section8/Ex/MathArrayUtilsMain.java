package section8.Ex;

//import static
import static section8.Ex.MathArrayUtils.*;

public class MathArrayUtilsMain {


    public static void main(String[] args) {

        //생성자 생성 막는 이유 : 인스턴스에 접근하면 메모리 낭비가 되기 떄문
        //MathArrayUtils를 private로 부여함으로 생성자를 생성하지 못하게 제약을 제공
        //MathArrayUtils mathArrayUtils = new MathArrayUtils();
        //'MathArrayUtils()' has private access in 'section8.Ex.MathArrayUtils'
        //제약이 있는 개발이 좋은 개발


        int [] values = {1, 2, 3, 4, 5};
        System.out.println(" = " + sum(values));
        System.out.println(" = " + aver(values));
        System.out.println(" = " + min(values));
        System.out.println(" = " + max(values));
    }
}
