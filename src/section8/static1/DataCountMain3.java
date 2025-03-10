package section8.static1;

public class DataCountMain3 {

    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C = " + Data3.count);

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); // 권장하지 않음
            //정적 변수의 경우 인스턴스를 통한 접근은 추천하지 않는다.
            //왜냐면 코드를 읽을 떄 마치 인스턴스 변수에 접근하는 것 처럼 오해할 수 있기 때문이다.
            // => Static member 'section8.static1.Data3.count' accessed via instance reference

        //클래스를 통한 접근
        System.out.println(Data3.count); // 공용변수에 바로 접근


    }
}
