package section9;

public class FinalFieldMain {

    public static void main(String[] args) {
        //final 필드 = 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(22);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");

        /*
        * 모든 인스턴스가 같은 값을 사용하기 때문에 결과적으로 메모리를 낭비하게 된다.
        * 또, 메모리 낭비를 떠나서 같은 값이 계속 생성되는 것은 개발자가 보기에 명확한 중복이다.
        * 이럴떄 사용하면 좋은 것이 바로 static영역이다.
        * FiledInit value는 static영역에 존재한다. val변수는 jv상에서 하나만 존재하므로
        * 앞서 설명한 중복과 메모리 비효율 문제를 모두 해결할 수 있다.
        *
        * 이런 이유로 필드에 final + 필드 초기화를 사용하는 경우 static을 붙여서 사용하는 것이 효과적이다.
        * */
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();

        System.out.println(fieldInit1.val+1);
        System.out.println(fieldInit2);
        System.out.println(fieldInit3);

        //상수
        System.out.println("상수");
        System.out.println(FieldInit.constValue);

    }
}
