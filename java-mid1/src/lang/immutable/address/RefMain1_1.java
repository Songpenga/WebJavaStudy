package lang.immutable.address;

public class RefMain1_1 {
    //참조형 변수는 하나의 인스턴스를 공유할 수 있다
    public static void main(String[] args) {
        Address a = new Address("울산");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setVal("서울"); // b의 값을 부산으로 변경해야함
        System.out.println("부산 ->>> b");
        System.out.println("a = " + a); //사이드 이펙트 발생
        System.out.println("b = " + b);

        /*
        *처음에는 a , b 둘다 서울이라는 주소를 가져야 한다고 가정하자.
        따라서 Address b = a 코드를 작성했고, 변수 a , b 둘다 서울이라는 주소를 가진다.
        이후에 b 의 주소를 부산으로 변경한다.
        그런데 실행 결과를 보면 b 뿐만 아니라 a 의 주소도 함께 부산으로 변경되어 버린다
        */
    }
}
