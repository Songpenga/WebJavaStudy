package section8.static1;

import section8.Data;

public class DataCountMain1 {

    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        Data1 data2 = new Data1("B");
        Data1 data3 = new Data1("C");

        System.out.println("A = " + data1.cnt);
        System.out.println("B = " + data2.cnt);
        System.out.println("C = " + data3.cnt);

        /* 250306
        *  객체를 생성할 떄 마다 Data1 인스턴스는 새로 만들어진다.
        *  그리고 인스턴스에 포함된 count 변수도 새로 만들어지기 때문이다.
        *
        * 인스턴스에 사용되는 멤버변수 count값은 인스턴스끼리 서로 공유되지 않는다.
        * 따라서 원하는 답을 구할 수 없다.
        * 이 문제를 해결하려면 변수를 서로 공유해야한다.
        */
    }
}
